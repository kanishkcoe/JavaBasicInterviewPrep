import java.util.Arrays;

public class MinimiseMaximumHeight {

    public static void main(String[] args) {
        int [] array = {1, 5, 8, 10};

        int k = 2;

        int difference = minimiseDifference(array, k);

        System.out.println(difference);
    }

    private static int minimiseDifference(int[] array, int k) {
        int min = 0, max = 0, result = 0;
        int n = array.length;

        Arrays.sort(array);

        result = array[n-1] - array[0];

        for (int i = 0; i < n; i++) {
            if(array[i] >= k) {
                max = Math.max(array[i-1] + k, array[n-1] - k);
                min = Math.min(array[i] - k, array[0] + k);

                result = Math.min(result, max - min);
            } else {
                continue;
            }
        }

        return result;
    }


}
