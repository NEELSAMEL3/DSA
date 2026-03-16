import java.util.HashMap;

public class MinimumWindow {

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int required = tCount.size();
        int formed = 0;

        HashMap<Character, Integer> windowCount = new HashMap<>();

        int[] ans = {-1, 0, 0};

        while (right < s.length()) {

            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (tCount.containsKey(c) && 
                windowCount.get(c).intValue() == tCount.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {

                c = s.charAt(left);

                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                windowCount.put(c, windowCount.get(c) - 1);

                if (tCount.containsKey(c) &&
                    windowCount.get(c).intValue() < tCount.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    public static void main(String[] args) {

        MinimumWindow obj = new MinimumWindow();

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = obj.minWindow(s, t);

        System.out.println("String: " + s);
        System.out.println("Pattern: " + t);
        System.out.println("Minimum Window: " + result);
    }
}