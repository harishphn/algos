import java.util.Scanner;

public class SearchNumberInRotatedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = getArray();
        int search;
        System.out.println("Search Number");
        search = scan.nextInt();
        System.out.println("Index of the number is: " + searchRotatedArray(getArray(), search));
    }

    public static int searchRotatedArray(int[] nums, int search) {
        //TODO
        return 0;
    }
}