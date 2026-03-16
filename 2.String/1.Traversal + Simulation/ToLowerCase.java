public class ToLowerCase {

    public String toLowerCase(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            ans.append(ch);
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        ToLowerCase obj = new ToLowerCase();

        String s = "Hello WORLD";

        String result = obj.toLowerCase(s);

        System.out.println(result);
    }
}