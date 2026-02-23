class CountPrefix {
    public int countPrefixes(String[] words, String s) {
        int count = 0; // Initialize counter
        
        for (String word : words) {
            // If the word is a prefix of s
            if (s.startsWith(word)) {
                count++;
            }
        }
        
        return count; // Return total count
    }
}