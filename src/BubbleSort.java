import java.util.Scanner;

public class BubbleSort
{
	public static void main(String[] args)
	{
		display(bubbleSort(getArray()));
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

	public static int[] bubbleSort(int[] nums)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			int numOfSwaps = 0;
			for(int j=0;j<nums.length-i-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					int swap = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = swap;
					numOfSwaps++;
				}
			}
			if(numOfSwaps==0)
			{
				break;
			}
		}
		return nums;
	}
}