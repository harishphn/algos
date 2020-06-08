package paypal;

import java.util.Scanner;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a new string");
        String str = scan.next();
        System.out.println("Length of longest palindromic substring: " + getLPS(str));
    }

    public static int getLPS(String str) {
        int count = 0;
        int n = str.length();
        boolean[][] table = new boolean[n][n];

        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            count++;
            table[i][i] = true;
        }

        int start = 0;

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && (str.charAt(i) == str.charAt(j))) {
                    count++;
                    table[i][j] = true;
                    if (k > maxLength) {
                        maxLength = k;
                        start = i;
                    }
                }
            }
        }
        System.out.println("Number of palindromic substrings: " + count);
        System.out.println("Longest palindromic substring: " + str.substring(start, start + maxLength));
        return maxLength;
    }
}