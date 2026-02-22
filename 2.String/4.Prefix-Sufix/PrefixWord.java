class PrefixCount {
    public int prefixCount(String[] words, String pref) {
        int count = 0; // Initialize a counter
        
        // Loop through each word in the array
        for (String word : words) {
            // If the word starts with the prefix, increment the counter
            if (word.startsWith(pref)) {
                count++;
            }
        }
        
        return count; // Return the total count
    }
}