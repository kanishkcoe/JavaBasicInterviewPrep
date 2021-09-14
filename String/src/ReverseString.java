public class ReverseString {
    public static void main(String[] args) {
        String string = "kanishk";

        System.out.println(string);

        string = reverseString(string);

        System.out.println(string);
    }

    private static String reverseString(String string) {
        char [] charArray = string.toCharArray();
        int last = string.length() - 1;
        char temp;

        for (int i = 0; i < last / 2; i++) {
            temp = charArray[i];
            charArray[i] = charArray[last - i];
            charArray[last - i] = temp;
        }

        string = new String(charArray);
        return string;
    }
}
