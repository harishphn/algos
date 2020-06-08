import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = getArray();
        int search;
        System.out.println("Search Number");
        search = scan.nextInt();
        if (binarySearch(nums, 0, nums.length - 1, search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public static boolean binarySearch(int[] nums, int left, int right, int search) {
        if (left == right) {
            if (nums[left] == search) {
                return true;
            } else {
                return false;
            }
        }
        int mid = (left + right) / 2;
        if (search == nums[mid]) {
            return true;
        } else if (search > nums[mid]) {
            return binarySearch(nums, mid + 1, right, search);
        } else {
            return binarySearch(nums, left, mid - 1, search);
        }
    }

    public static void display(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] getArray() {
        System.out.println("Enter the size of array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the numbers");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        return nums;
    }
}