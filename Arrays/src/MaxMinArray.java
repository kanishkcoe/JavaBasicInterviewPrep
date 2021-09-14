public class MaxMinArray {
    public static void main(String[] args) {
        int [] array = {9,81, 50, -45, 91, 40, 955, 2};

        printArray(array);

        int min = minimum(array);
        int max = maximum(array);

        System.out.println(min);
        System.out.println(max);
    }

    private static int minimum(int[] array) {
        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    private static int maximum(int[] array) {
        int max = array[0];

        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
