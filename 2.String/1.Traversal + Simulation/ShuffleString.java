public class ShuffleString {

    public String restoreString(String s, int[] indices) {

        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }

    public static void main(String[] args) {

        ShuffleString obj = new ShuffleString();

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String result = obj.restoreString(s, indices);

        System.out.println(result);
    }
}