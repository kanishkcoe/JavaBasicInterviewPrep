import java.util.Comparator;
import java.util.PriorityQueue;

public class KthMaxMinArray {

    public static void main(String[] args) {
        int [] array = {9,81, 50, -45, 91, 40, 955, 2};

        printArray(array);

        int k = 3;

        int min = kthminimum(array, k);
        int max = kthmaximum(array, k);

        System.out.println(min);
        System.out.println(max);
    }

    private static int kthmaximum(int[] array, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < k; i++) {
            priorityQueue.add(array[i]);
        }

        for(int i = k; i < array.length; i++) {
            if(array[i] > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(array[i]);
            }
        }

        return priorityQueue.peek();

    }

    private static int kthminimum(int[] array, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < k; i++) {
            priorityQueue.add(array[i]);
        }

        for(int i = k; i < array.length; i++) {
            if(array[i] < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(array[i]);
            }
        }

        return priorityQueue.peek();

    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
