import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26]; // frequency of characters in p
        int[] sCount = new int[26]; // frequency of current window in s

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();
        for (int i = 0; i < s.length(); i++) {
            // Add current character to window
            sCount[s.charAt(i) - 'a']++;

            // Remove the leftmost character when window exceeds size
            if (i >= windowSize) {
                sCount[s.charAt(i - windowSize) - 'a']--;
            }

            // Compare window with p
            if (Arrays.equals(sCount, pCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}