public class SortSentences {

    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (String word : words) {

            int pos = word.charAt(word.length() - 1) - '0';

            ans[pos - 1] = word.substring(0, word.length() - 1);
        }

        StringBuilder result = new StringBuilder();

        for (String word : ans) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        SortSentences obj = new SortSentences();

        String s = "is2 sentence4 This1 a3";

        String result = obj.sortSentence(s);

        System.out.println(result);
    }
}