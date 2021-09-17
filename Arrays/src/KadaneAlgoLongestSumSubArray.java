import java.util.ArrayList;

public class KadaneAlgoLongestSumSubArray {

    public static void main(String[] args) {
        int [] array = {4, 3, -2, 6, -14, 7, -1, 4, 5, 7, -10, 2, 9, -10, -5, -9, 6, 1};

        int sum = longestSumSubArray(array);

        System.out.println("sum = " + sum);
    }

    private static int longestSumSubArray(int[] array) {

        ArrayList<Integer> currentBest = new ArrayList<>();
        ArrayList<Integer> overallBest = new ArrayList<>();
        int currentBestSum = array[0];
        int overallBestSum = array[0];

        for(int i = 1; i < array.length; i++) {
            if(currentBestSum >= 0) {
                currentBest.add(array[i]);
                currentBestSum = currentBestSum + array[i];
            } else {
                currentBest.clear();
                currentBest.add(array[i]);
                currentBestSum = array[i];
            }

            if(currentBestSum > overallBestSum) {
                overallBestSum = currentBestSum;
                overallBest.clear();
                overallBest.addAll(currentBest);
            }

            System.out.println(overallBest + " = " + overallBestSum);
        }

        System.out.println(overallBest + " = " + overallBestSum);

        return overallBestSum;
    }


}
