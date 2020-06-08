package paypal;

import java.util.Scanner;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int a = scan.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter array elements");
        for (int i = 0; i < a; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Maximum subarray sum: " + Solution.maxSubArray(arr));
    }
}


class Solution {
    public static int maxSubArray(int[] nums) {

        return maxSum(nums, 0, nums.length - 1);

    }

    public static int maxSum(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = (left + right) / 2;

        return Math.max(Math.max(maxSum(nums, left, mid), maxSum(nums, mid + 1, right)), maxMidSum(nums, left, mid, right));
    }

    public static int maxMidSum(int[] nums, int left, int mid, int right) {
        int sum = 0;
        int leftsum = Integer.MIN_VALUE;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            if (sum > leftsum) {
                leftsum = sum;
            }
        }


        int sum2 = 0;
        int rightsum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= right; i++) {
            sum2 += nums[i];
            if (sum2 > rightsum) {
                rightsum = sum2;
            }
        }

        return leftsum + rightsum;
    }
}