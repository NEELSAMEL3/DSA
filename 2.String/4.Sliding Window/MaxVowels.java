import java.util.HashSet;
import java.util.Set;

class MaxVowels {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');

        int maxCount = 0;
        int windowCount = 0;

        // Initialize the first window
        for (int i = 0; i < k && i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                windowCount++;
            }
        }
        maxCount = windowCount;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            // Remove the character going out of the window
            if (vowels.contains(s.charAt(i - k))) {
                windowCount--;
            }
            // Add the new character
            if (vowels.contains(s.charAt(i))) {
                windowCount++;
            }
            maxCount = Math.max(maxCount, windowCount);
        }

        return maxCount;
    }
}