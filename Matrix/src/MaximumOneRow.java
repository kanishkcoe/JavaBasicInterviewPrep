import java.util.Scanner;

public class MaximumOneRow {

    public static void main(String[] args) {
        int rows, columns;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter columns : ");
        columns = scanner.nextInt();

        int [][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int MaxRow = maxOneRow(matrix);
        System.out.println(MaxRow);
    }

    private static int maxOneRow(int[][] matrix) {
        int rows = matrix.length;
        int currentOneCount;
        int overallOneCount = 0;
        int maxOneRow = 0;

        for (int i = 0; i < rows; i++) {
            currentOneCount = binarySearch(matrix, i);

            if(currentOneCount >= overallOneCount) {
                overallOneCount = currentOneCount;
                maxOneRow = i;
            }
        }

        System.out.println("Maximum number of one is : " + overallOneCount);
        return maxOneRow;
    }

    private static int binarySearch(int[][] matrix, int i) {

        int low = 0;
        int high = matrix[i].length - 1;
        int firstOneLocation = matrix[i].length;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(matrix[i][mid] == 1) {
                firstOneLocation = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return matrix[i].length - firstOneLocation;
    }


}
