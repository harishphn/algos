import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        //Sorting: Quick Sort
		/*
		QuickSort is a Divide and Conquer algorithm. 
		It picks an element as pivot and partitions the given array around the picked pivot. 
		There are many different versions of quickSort that pick pivot in different ways.
		
		Always pick first element as pivot.
		Always pick last element as pivot (implemented below)
		Pick a random element as pivot.
		Pick median as pivot.
		*/
        int[] qnumbers = getArray();
        quicksort(qnumbers, 0, qnumbers.length - 1);
        display(qnumbers);
    }

    public static void quicksort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            int x = nums[mid];
            int i = left;
            int j = right;
            do {
                while (nums[i] < x) {
                    i++;
                }
                while (nums[j] > x) {
                    j--;
                }
                if (i <= j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (left < j) {
                quicksort(nums, left, j);
            }
            if (i < right) {
                quicksort(nums, i, right);
            }
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