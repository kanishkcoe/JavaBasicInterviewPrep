public class Sort123Array {
    public static void main(String[] args) {

        int [] array = {0, 0, 1, 1, 2, 2, 2, 2, 0, 0, 1, 1, 0, 0, 0, 2, 2};

        printArray(array);

        array = sortArray(array);
        System.out.println();
        printArray(array);
    }

    private static int[] sortArray(int[] array) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                count0++;
            } else if (array[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        for (int i = 0; i < count0; i++) {
            array[index++] = 0;
        }

        for (int i = 0; i < count1; i++) {
            array[index++] = 1;
        }

        for (int i = 0; i < count2; i++) {
            array[index++] = 2;
        }

        return array;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
