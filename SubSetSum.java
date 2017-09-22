import java.util.Scanner;

public class SubSetSum
{
	public static void main(String[] args)
	{
		//DP: subset Sum
		//http://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		System.out.println("Enter the array values");
		int[] nums = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i] = scan.nextInt();
		}
		System.out.println("Enter the sum");
		int sum = scan.nextInt();
		//recursive approach. Exponential. Repeating subproblems.
		//System.out.println("Is Subset Sum: " + isSubsetSum(nums, n, sum));

		//iterative approach - Memorization.
		System.out.println("Is Subset Sum: " + isSubsetSumIterative(nums, n, sum));		 
	}

	public static boolean isSubsetSum(int[] nums, int n, int sum)
	{
		if(sum==0)
		{
			return true;
		}
		if(sum!=0 && n==0)
		{
			return false;
		}

		if(nums[n-1]>sum)
		{
			return isSubsetSum(nums, n-1, sum);
		}
		return isSubsetSum(nums, n-1, sum) || isSubsetSum(nums, n-1, sum-nums[n-1]);
	}

	public static boolean isSubsetSumIterative(int[] nums, int n, int sum)
	{
		boolean[][] res = new  boolean[n+1][sum+1];

		for(int i=0;i<=n;i++)
		{
			res[i][0] = true;
		}

		for(int j=1;j<=sum;j++)
		{
			res[0][j] = false;
		}

		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(j<nums[i])
				{
					res[i][j] = res[i-1][j];
				}
				else
				{
					res[i][j] = res[i-1][j] || res[i-1][j-nums[i]];
				}
			}
		}

		return res[n-1][sum];
	}
}