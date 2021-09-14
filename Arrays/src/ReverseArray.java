public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        printArray(array);

        array = reverseArray(array);

        printArray(array);
    }

    private static int[] reverseArray(int[] array) {
        int last = array.length - 1;
        int temp;

        for(int i = 0; i <= last / 2; i++) {
            temp = array[i];
            array[i] = array[last - i];
            array[last - i] = temp;
        }

        return array;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
