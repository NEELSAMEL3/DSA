import java.util.*;

public class FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26]; 
        int[] sCount = new int[26]; 

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {

            // Add current character
            sCount[s.charAt(i) - 'a']++;

            // Remove leftmost character if window exceeded
            if (i >= windowSize) {
                sCount[s.charAt(i - windowSize) - 'a']--;
            }

            // Compare arrays
            if (Arrays.equals(sCount, pCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = obj.findAnagrams(s, p);

        System.out.println("String: " + s);
        System.out.println("Pattern: " + p);
        System.out.println("Anagram indices: " + result);
    }
}