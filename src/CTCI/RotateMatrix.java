package CTCI;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter nxn matrix size");
        int n = scan.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("No shifting required");
        } else {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter elements for row: " + i + 1);
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }

            rotateMatrix(matrix);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        scan.close();
    }

    public static void rotateMatrix(int[][] matrix) {

    }
}