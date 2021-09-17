import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int rows, columns;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter columns : ");
        columns = scanner.nextInt();

        int [][] a = new int[rows][columns];
        inputMatrix(a);

        System.out.println("Enter rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter columns : ");
        columns = scanner.nextInt();

        int [][] b = new int[rows][columns];
        inputMatrix(b);

        displayMatrix(a);
        displayMatrix(b);

        int [][] c = matrixMultiply(a, b);
        if(c == null) {
            System.out.println("cannot multiply");
        } else {
            displayMatrix(c);
        }

    }

    private static int[][] matrixMultiply(int[][] a, int[][] b) {
        if(a[0].length != b.length) {
            return null;
        }

        int [][] c = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    private static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix elements : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
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
