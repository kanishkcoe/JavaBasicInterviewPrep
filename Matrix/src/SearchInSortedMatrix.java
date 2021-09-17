import java.util.ArrayList;
import java.util.Scanner;

public class SearchInSortedMatrix {
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

        System.out.println("Enter element to search : ");
        int element = scanner.nextInt();

        displayMatrix(matrix);
        ArrayList<Integer> searchIndex = search(matrix, element);
        System.out.println("index : " + searchIndex);
    }

    private static ArrayList<Integer> search(int[][] matrix, int element) {
        int i = 0;
        int j = matrix[0].length - 1;
        ArrayList<Integer> index = new ArrayList<>();

        while(i >= 0 && j >= 0 && i < matrix.length && j < matrix[0].length) {
            if(matrix[i][j] == element) {
                index.add(i);
                index.add(j);
                break;
            } else if(matrix[i][j] > element) {
                j--;
            } else {
                i++;
            }
        }

        if(index.size() == 0) {
            System.out.println("element not found");
        }

        return index;
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
