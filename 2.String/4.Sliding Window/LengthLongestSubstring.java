import java.util.HashSet;

public class LengthLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < n) {

            char current = s.charAt(right);

            if (!set.contains(current)) {
                set.add(current);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } 
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        LengthLongestSubstring obj = new LengthLongestSubstring();

        String input = "abcabcbb";

        int result = obj.lengthOfLongestSubstring(input);

        System.out.println("Input: " + input);
        System.out.println("Longest substring length: " + result);
    }
}