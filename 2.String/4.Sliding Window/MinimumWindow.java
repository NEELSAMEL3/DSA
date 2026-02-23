import java.util.HashMap;

class MinimumWindow {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        // Count characters in t
        HashMap<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        // Sliding window
        int left = 0, right = 0;
        int required = tCount.size(); // number of unique characters in t to match
        int formed = 0; // how many unique characters in current window satisfy the count
        HashMap<Character, Integer> windowCount = new HashMap<>();

        // Result [window length, left, right]
        int[] ans = {-1, 0, 0};

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (tCount.containsKey(c) && windowCount.get(c).intValue() == tCount.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window from the left
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update result if smaller window is found
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                // Remove left character from window
                windowCount.put(c, windowCount.get(c) - 1);
                if (tCount.containsKey(c) && windowCount.get(c).intValue() < tCount.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}