class LongestPalindrome {
    public int longestPalindrome(String s) {
        
        int[] count = new int[128]; // ASCII characters
        
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        for (int c : count) {
            length += (c / 2) * 2; // add pairs
            if (c % 2 == 1) {
                hasOdd = true; // mark that we can use one in center
            }
        }
        
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}