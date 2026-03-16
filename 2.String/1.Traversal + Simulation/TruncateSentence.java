public class TruncateSentence {

    public String truncateSentence(String s, int k) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;
            }

            if (count == k) {
                return s.substring(0, i);
            }
        }

        return s;
    }

    public static void main(String[] args) {

        TruncateSentence obj = new TruncateSentence();

        String s = "Hello how are you Contestant";
        int k = 4;

        String result = obj.truncateSentence(s, k);

        System.out.println(result);
    }
}