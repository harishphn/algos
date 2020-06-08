import java.util.Scanner;

public class BytelandianGold {
    public static void main(String[] args) {
        //DP: ByteLandian Gold.
        //http://www.spoj.com/problems/COINS/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter byteLandianGold: ");
        int gold = scan.nextInt();
        byteLandianGold(gold);
    }

    public static void byteLandianGold(int gold) {
        int[] sol = new int[gold + 1];
        sol[0] = 0;
        for (int i = 1; i <= gold; i++) {
            int temp = sol[i / 2] + sol[i / 3] + sol[i / 4];
            sol[i] = temp > i ? temp : i;
        }
        System.out.println("Max USD: " + sol[gold]);
    }
}