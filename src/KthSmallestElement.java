import java.util.Scanner;

public class KthSmallestElement
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//Sorting: Quick Sort
		int[] qnumbers = getArray();
		System.out.println("Enter value for k.");
		int k = scan.nextInt();
		System.out.println(kthsmallest(qnumbers, 0, qnumbers.length-1, k));
		//display(qnumbers);
	}

	public static int kthsmallest(int[] nums, int left, int right, int k)
	{
		if(left<right)
		{
			int mid = (left+right)/2;
			if(mid-left==k-1)
			{
				return nums[mid];
			}
			int x = nums[mid];
			int i=left;
			int j = right;
			do
			{	
				while(nums[i]<x)
				{
					i++;
				}
				while(nums[j]>x)
				{
					j--;
				}
				if (i <= j)
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					i++;
					j--;
				}
			}while(i<=j);
			if(mid-left>k-1)
			{
				return kthsmallest(nums, left, j, k);
			}
			return kthsmallest(nums, i, right, k);
		}
		return Integer.MAX_VALUE;
	}

	public static void display(int[] nums)
	{
		for(int x:nums)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static int[] getArray()
	{
		System.out.println("Enter the size of array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter the numbers");
		int[] nums = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i] = scan.nextInt();
		}
		return nums;
	}

}