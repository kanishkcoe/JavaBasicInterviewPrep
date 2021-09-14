public class PalindromeCheck {
    public static void main(String[] args) {
        String string = "malayalam";

        System.out.println(string);

        boolean palindromeCheck = isPalindrome(string);

        System.out.println(palindromeCheck);
    }

    private static boolean isPalindrome(String string) {
        char [] charArray = string.toCharArray();
        int last = string.length() - 1;

        for (int i = 0; i < last / 2; i++) {
            if(charArray[i] != charArray[last - i]) {
                return false;
            }
        }

        return true;
    }
}
