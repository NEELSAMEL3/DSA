public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (!Character.isLetter(arr[i])) {
                i++;
            }
            else if (!Character.isLetter(arr[j])) {
                j--;
            }
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseOnlyLetters obj = new ReverseOnlyLetters();

        String input = "a-bC-dEf-ghIj";
        String result = obj.reverseOnlyLetters(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}