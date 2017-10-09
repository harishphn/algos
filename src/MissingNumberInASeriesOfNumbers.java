import java.util.Scanner;

public class MissingNumberInASeriesOfNumbers
{
	public static void main(String[] args)
	{
		System.out.println("Missing number is: " + missingNumber(getArray()));
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

	public static int missingNumber(int[] nums)
	{
		int sum = 0;
		for(int x:nums)
		{
			sum+=x;
		}
		int totalSum=0;
		for(int i=1;i<=nums.length+1;i++)
		{
			totalSum+=i;
		}
		return totalSum - sum;
	}
}