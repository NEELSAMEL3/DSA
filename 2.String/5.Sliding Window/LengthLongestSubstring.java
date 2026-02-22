import java.util.HashSet;

class LengthLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0; // window pointers
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            char current = s.charAt(right);

            if (!set.contains(current)) {
                set.add(current);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}