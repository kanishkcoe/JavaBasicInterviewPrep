import java.util.Scanner;

public class SpiralTraversal {

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
        
        spiralDisplayMatrix(matrix);
    }

    private static void spiralDisplayMatrix(int[][] matrix) {
        int minRow = 0;
        int maxRow = matrix.length - 1;

        int minColumn = 0;
        int maxColumn = matrix[0].length - 1;

        int total = (maxRow + 1) * (maxColumn + 1);
        int count = 0;

        while(count < total) {
            //left wall
            for(int i = minRow, j = minColumn; i <= maxRow && count < total; i++) {
                System.out.println(matrix[i][j]);
                count++;
            }
            minColumn++;
            //bottom wall
            for(int i = maxRow, j = minColumn; j <= maxColumn && count < total; j++) {
                System.out.println(matrix[i][j]);
                count++;
            }
            maxRow--;

            //right wall
            for(int i = maxRow, j = maxColumn; i >= minRow && count < total; i--) {
                System.out.println(matrix[i][j]);
                count++;
            }
            maxColumn--;

            //top wall
            for(int i = minRow, j = maxColumn; j >= minColumn && count < total; j--) {
                System.out.println(matrix[i][j]);
                count++;
            }
            minRow++;
        }
    }

    private static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]  + ", ");
            }
            System.out.println();
        }
    }
}
