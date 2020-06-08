import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
        //DP: mincost path
        //http://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row size");
        int m = scan.nextInt();
        System.out.println("Enter column size");
        int n = scan.nextInt();
        int[][] cost = new int[m][n];
        System.out.println("Enter the matrix elements");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter elements for row: " + (i + 1));
            for (int j = 0; j < n; j++) {
                cost[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter position: (m,n)");
        int p = scan.nextInt();
        int q = scan.nextInt();
        int[][] minCost = new int[m][n];
        minCost[0][0] = cost[0][0];
        for (int i = 1; i < m; i++) {
            minCost[i][0] = minCost[i - 1][0] + cost[i][0];
        }
        for (int i = 1; i < n; i++) {
            minCost[0][i] = minCost[0][i - 1] + cost[0][i];
        }
        minCost[0][0] = 0;
        System.out.println("Min Cost is: " + minCostPath(cost, p, q, minCost));
    }


    public static int minCostPath(int[][] cost, int p, int q, int[][] minCost) {
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= q; j++) {
                minCost[i][j] = min(minCost[i - 1][j], minCost[i][j - 1], minCost[i - 1][j - 1]) + cost[i][j];
            }
        }
        return minCost[p][q];
    }

    public static int min(int i, int j, int k) {
        int small = Math.min(i, j);
        if (k < small) {
            small = k;
        }
        return small;
    }
}