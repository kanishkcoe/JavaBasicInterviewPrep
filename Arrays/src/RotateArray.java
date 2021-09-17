public class RotateArray {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};

        int rotationCount = 3;

        printArray(array);

        rotateArray(array, rotationCount);

        printArray(array);
    }

    private static void rotateArray(int[] array, int rotationCount) {
        int normalisedCount = rotationCount % array.length;

        if(normalisedCount < 0) {
            normalisedCount = normalisedCount + array.length;
        }

        reverseArray(array, 0, normalisedCount - 1);
        reverseArray(array, normalisedCount, array.length - 1);

        reverseArray(array, 0, array.length - 1);
    }

    private static void reverseArray(int[] array, int start, int end) {
        int i = start;
        int j = end;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    private static void printArray(int[] array1) {
        System.out.println("+++++++++++++++++++++++++++++++++");
        for( int element : array1) {
            System.out.print(element + ", ");
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++");
    }
}
