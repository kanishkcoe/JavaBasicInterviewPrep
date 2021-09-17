import java.util.Scanner;

public class ShellRotate {
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

        System.out.println("Enter shell number : ");
        int shell = scanner.nextInt();
        System.out.println("Enter rotation count : ");
        int rotation = scanner.nextInt();

        shellRotateMatrix(matrix, shell, rotation);

        displayMatrix(matrix);
    }

    private static void shellRotateMatrix(int[][] matrix, int shell, int rotation) {
        int [] array = getOneDArrayFromMatrix(matrix, shell);

        rotateArray(array, rotation);

        fillMatrixWithOneDArray(matrix, array, shell);
    }

    private static void fillMatrixWithOneDArray(int[][] matrix, int[] array, int shell) {
        int minRow = shell - 1;
        int minColumn = shell - 1;

        int maxRow = matrix.length - shell;
        int maxColumn = matrix[0].length - shell;

        int index = 0;

        for (int i = minRow, j = minColumn; i <= maxRow; i++) {
             matrix[i][j] = array[index++];
        }
        minColumn++;
        for (int i = maxRow, j = minColumn; j <= maxColumn; j++) {
            matrix[i][j] = array[index++];
        }
        maxRow--;
        for (int i = maxRow, j = maxColumn; i >= minRow; i--) {
            matrix[i][j] = array[index++];
        }
        maxColumn--;
        for (int i = minRow, j = maxColumn; j >= minColumn; j--) {
             matrix[i][j] = array[index++];
        }

    }

    private static int[] getOneDArrayFromMatrix(int[][] matrix, int shell) {
        int minRow = shell - 1;
        int minColumn = shell - 1;

        int maxRow = matrix.length - shell;
        int maxColumn = matrix[0].length - shell;

        int leftWall = maxRow - minRow + 1;
        int bottomWall = maxColumn - minColumn + 1;
        int rightWall = maxRow - minRow + 1;
        int topWall = maxColumn - minColumn + 1;
        int size = leftWall + bottomWall + rightWall + topWall - 4;
        System.out.println(size);
        int [] array = new int[size];

        int index = 0;

        for (int i = minRow, j = minColumn; i <= maxRow; i++) {
            array[index++] = matrix[i][j];
        }
        minColumn++;
        for (int i = maxRow, j = minColumn; j <= maxColumn; j++) {
            array[index++] = matrix[i][j];
        }
        maxRow--;
        for (int i = maxRow, j = maxColumn; i >= minRow; i--) {
            array[index++] = matrix[i][j];
        }
        maxColumn--;
        for (int i = minRow, j = maxColumn; j >= minColumn; j--) {
            array[index++] = matrix[i][j];
        }

        return array;
    }

    private static void rotateArray(int[] array, int rotation) {
        rotation = rotation % array.length;

        if(rotation < 0) {
            rotation = array.length + rotation;
        }
        reverse(array, 0, rotation - 1);
        reverse(array, rotation, array.length - 1);
        reverse(array, 0, array.length - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        int i = start;
        int j = end;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
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
