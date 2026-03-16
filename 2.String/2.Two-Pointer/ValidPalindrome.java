public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != 
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        ValidPalindrome obj = new ValidPalindrome();

        String input = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + result);
    }
}