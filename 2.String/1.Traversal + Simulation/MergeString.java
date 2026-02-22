class MergeString {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(word1.length(), word2.length());

        for (int k = 0; k < maxLen; k++) {

            if (k < word1.length()) {
                sb.append(word1.charAt(k));
            }

            if (k < word2.length()) {
                sb.append(word2.charAt(k));
            }
        }

        return sb.toString();
    }
}