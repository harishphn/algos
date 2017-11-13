import java.util.Scanner;

public class InsertionSort
{
	public static void main(String[] args)
	{
		/*
		Insertion sort iterates, consuming one input element each repetition, 
		and growing a sorted output list. At each iteration, 
		insertion sort removes one element from the input data, 
		finds the location it belongs within the sorted list, and inserts it there. 
		It repeats until no input elements remain.

		*/
		display(insertionSort(getArray()));
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

	public static int[] insertionSort(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			int j=i;
			while(j>0 && nums[j-1]>nums[j])
			{
				int swap = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = swap;
				j--;
			}
		}
		return nums;
	}
}