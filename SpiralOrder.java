import java.util.Scanner;

public class SpiralOrder {
    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0;
        int bottomRow = r - 1;
        int leftCol = 0;
        int rightCol = c - 1;
        int totalElements = 0;
        int totalCount = r * c;

        while (totalElements < totalCount) {
            // topRow --> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < totalCount; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCol --> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < totalCount; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottomRow --> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < totalCount; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < totalCount; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix:");
        printArray(matrix);
        System.out.println("Spiral Order:");
        spiralOrder(matrix, r, c);
    }
}
