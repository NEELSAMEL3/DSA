class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // frequency of letters in current window
        int maxCount = 0; // count of the most frequent letter in the window
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // If window size minus max frequency > k, shrink window
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}