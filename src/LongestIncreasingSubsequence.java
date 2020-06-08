import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        //DP
        //http://www.geeksforgeeks.org/longest-increasing-subsequence/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        System.out.println("Enter the array values");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

    }
}