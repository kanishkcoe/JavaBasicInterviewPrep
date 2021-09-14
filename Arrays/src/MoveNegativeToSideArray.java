public class MoveNegativeToSideArray {
    public static void main(String[] args) {

        int [] array = {0, 0, -1, 1, -2, -2, -2, 2, 0, 0, 1, -1, 0, 0, 0, -2, 2};

        printArray(array);

        array = moveNegativeToSideArray(array);
        System.out.println();
        printArray(array);
    }

    private static int[] moveNegativeToSideArray(int[] array) {
        int negativeCount = 0;
        int positiveCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }

        int [] negativeArray = new int[negativeCount];
        int [] positiveArray = new int[positiveCount];

        int negativeIndex = 0;
        int positiveIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArray[negativeIndex++] = array[i];
            } else {
                positiveArray[positiveIndex++] = array[i];
            }
        }

        int index = 0;

        for (int i = 0; i < negativeCount; i++) {
            array[index++] = negativeArray[i];
        }

        for (int i = 0; i < positiveCount; i++) {
            array[index++] = positiveArray[i];
        }

        return array;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
