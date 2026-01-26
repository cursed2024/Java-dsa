import java.util.Scanner;

public class CountIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] arr = new int[rows][cols];

        // Input matrix
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Number to search
        System.out.print("Enter number to count: ");
        int target = sc.nextInt();

        int count = 0;

        // Count occurrences
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    count++;
                }
            }
        }

        // Output result
        if (count > 0) {
            System.out.println("Number " + target + " appears " + count + " times.");
        } else {
            System.out.println("Number not found in the array.");
        }

        sc.close();
    }
}
