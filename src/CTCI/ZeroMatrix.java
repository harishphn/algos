package CTCI;

import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter nxn matrix size");
        int n = scan.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("No modifications required");
        } else {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter elements for row: " + (i + 1));
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }
            System.out.println("Before");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            zeroMatrix(matrix);
            System.out.println("After");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        scan.close();
    }

    public static void zeroMatrix(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < col.length; i++) {
            if (col[i] == 1) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }


    }
}