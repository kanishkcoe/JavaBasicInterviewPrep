import java.util.Scanner;

public class RotateMatrix {
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

        displayMatrix(matrix);
        matrix = transposeMatrix(matrix);
        displayMatrix(matrix);
        swapColumnsMatrix(matrix);
        displayMatrix(matrix);
    }

    private static void swapColumnsMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns - 1 - j];
                matrix[i][columns - 1 - j] = temp;
            }
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [][] newMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }

    private static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        System.out.println("------------------------------------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]  + ", ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }
}
