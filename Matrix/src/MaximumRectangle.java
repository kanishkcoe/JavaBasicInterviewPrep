import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MaximumRectangle {

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

        int maximumRectangleArea = maxRectangleAreaInMatrix(matrix);

        System.out.println("maximum area  :  " + maximumRectangleArea);
    }

    private static int maxRectangleAreaInMatrix(int[][] matrix) {
        int [] row = new int[matrix[0].length];
        int currentArea;
        int overallBestArea;

        for(int i = 0; i < matrix[0].length; i++) {
            row[i] = matrix[0][i];
        }
        printArray(row);
        currentArea = maxRectangleAreaInArray(row);
        overallBestArea = currentArea;

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    row[j] = 0;
                } else {
                    row[j] += matrix[i][j];
                }
            }
            currentArea = maxRectangleAreaInArray(row);

            if(currentArea > overallBestArea) {
                overallBestArea = currentArea;
            }
        }

        return overallBestArea;
    }

    private static int maxRectangleAreaInArray(int[] array) {
        printArray(array);
        int [] leftBoundary = new int[array.length];
        int [] rightBoundary = new int[array.length];

        Stack<Integer> stack = new Stack<>();

        rightBoundary[array.length - 1] = array.length;
        stack = new Stack<>();
        stack.push(array.length - 1);
        for(int i = array.length - 2; i >= 0; i--) {
            while(stack.size() > 0 && array[i] <= array[stack.peek()]) {
                stack.pop();
            }

            if(stack.size() == 0) {
                rightBoundary[i] = array.length;
            } else {
                rightBoundary[i] = stack.peek();
            }
            stack.push(i);
        }

        leftBoundary[0] = -1;
        stack.push(0);
        for(int i = 1; i < array.length; i++) {
            while(stack.size() > 0 && array[i] <= array[stack.peek()]) {
                stack.pop();
            }

            if(stack.size() == 0) {
                leftBoundary[i] = -1;
            } else {
                leftBoundary[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;

        System.out.println("left : ");
        printArray(leftBoundary);
        System.out.println("right : ");
        printArray(rightBoundary);
        for (int i = 0; i < array.length; i++) {
            int area = array[i] * (rightBoundary[i] - leftBoundary[i] - 1);
            if (area > maxArea) {
                maxArea = area;
            }
            System.out.println(area);
        }

        return maxArea;
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

    private static void printArray(int [] array) {
        System.out.println("--------------------------");
        for (int element: array) {
            System.out.print(element + ", ");
        }
        System.out.println("\n--------------------------");
    }
}
