import java.util.Arrays;

public class DuplicateInNArray {
    public static void main(String[] args) {
        int [] array = {1, 4, 5, 6, 3, 3, 2};

        int duplicate = getDuplicate(array);

        System.out.println("duplicate : " + duplicate);
    }

    private static int getDuplicate(int [] array) {
        Arrays.sort(array);
        int duplicate = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1]) {
                duplicate = array[i];
                break;
            }
        }

        return duplicate;
    }
}
