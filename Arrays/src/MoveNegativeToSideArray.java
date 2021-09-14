public class MoveNegativeToSideArray {
    public static void main(String[] args) {

        int [] array = {0, 0, -1, 1, -2, -2, -2, 2, 0, 0, 1, -1, 0, 0, 0, -2, 2};

        printArray(array);

        moveNegativeToSideArray(array);
        System.out.println();
        printArray(array);
    }

    private static void moveNegativeToSideArray(int[] array) {
        int negativeCount = 0;
        int positiveCount = 0;
        for (int j : array) {
            if (j < 0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }

        int [] negativeArray = new int[negativeCount];
        int [] positiveArray = new int[positiveCount];

        int negativeIndex = 0;
        int positiveIndex = 0;

        for (int j : array) {
            if (j < 0) {
                negativeArray[negativeIndex++] = j;
            } else {
                positiveArray[positiveIndex++] = j;
            }
        }

        int index = 0;

        for (int i = 0; i < negativeCount; i++) {
            array[index++] = negativeArray[i];
        }

        for (int i = 0; i < positiveCount; i++) {
            array[index++] = positiveArray[i];
        }

    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + ", ");
        }
    }
}
