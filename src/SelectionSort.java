import java.util.Scanner;

public class SelectionSort
{
	public static void main(String[] args)
	{
		/*
		The selection sort algorithm sorts an array by repeatedly finding the minimum element 
		(considering ascending order) from unsorted part and putting it at the beginning. 
		The algorithm maintains two subarrays in a given array.

		*/
		display(selectionSort(getArray()));
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

	public static int[] selectionSort(int[] nums)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					int swap = nums[i];
					nums[i] = nums[j];
					nums[j] = swap;
				}
			}
		}
		return nums;
	}
}