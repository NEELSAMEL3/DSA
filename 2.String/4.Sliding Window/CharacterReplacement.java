public class CharacterReplacement {

    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // frequency of letters in current window
        int maxCount = 0; // most frequent letter count in window
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // shrink window if replacements needed > k
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        CharacterReplacement obj = new CharacterReplacement();

        String input = "AABABBA";
        int k = 1;

        int result = obj.characterReplacement(input, k);

        System.out.println("Input: " + input);
        System.out.println("k = " + k);
        System.out.println("Longest Length: " + result);
    }
}