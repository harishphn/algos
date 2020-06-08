import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        //Sorting: Heap Sort (Binary Heap)
        int[] hnumbers = getArray();
        heapsort(hnumbers, hnumbers.length);
        display(hnumbers);
        //Not Working as expected! Fix it!
    }

    public static void heapsort(int[] nums, int n) {
		/*
		First heapify (either max or min) non-leaf nodes. last non-leaf node is n/2 - 1. 
		Then, you will have the max/min element at the root position, now swap it with the last leaf element and heapify remaining elements.
		This will put the max/min element in the last position of the array.
		continue this process until there are no elements in heap.
		*/
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;

            heapify(nums, i, 0);
        }
    }

    public static void heapify(int[] nums, int n, int i) {
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        int largest = i;
        if (left < n && nums[left] > nums[i]) {
            largest = left;
        }
        if (right < n && nums[right] > nums[i]) {
            largest = right;
        }
        if (largest != i) {
            int temp = nums[largest];
            nums[largest] = nums[i];
            nums[i] = temp;

            heapify(nums, n, largest);
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