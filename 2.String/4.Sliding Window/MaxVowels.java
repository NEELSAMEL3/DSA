import java.util.HashSet;
import java.util.Set;

public class MaxVowels {

    public int maxVowels(String s, int k) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); 
        vowels.add('e'); 
        vowels.add('i'); 
        vowels.add('o'); 
        vowels.add('u');

        int maxCount = 0;
        int windowCount = 0;

        // First window
        for (int i = 0; i < k && i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                windowCount++;
            }
        }

        maxCount = windowCount;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            // Remove left character
            if (vowels.contains(s.charAt(i - k))) {
                windowCount--;
            }

            // Add new character
            if (vowels.contains(s.charAt(i))) {
                windowCount++;
            }

            maxCount = Math.max(maxCount, windowCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {

        MaxVowels obj = new MaxVowels();

        String s = "abciiidef";
        int k = 3;

        int result = obj.maxVowels(s, k);

        System.out.println("String: " + s);
        System.out.println("k = " + k);
        System.out.println("Max vowels in substring: " + result);
    }
}