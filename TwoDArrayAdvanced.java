import java.util.Scanner;

public class TwoDArrayAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3;
        int cols = 3;
        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Row sums
        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }

        // Column sums
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }

        // Find largest element
        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("\nLargest element in the matrix: " + max);

        sc.close();
    }
}
