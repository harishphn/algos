import java.util.Scanner;

public class SlidingWindowMaximum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = scan.nextInt();
		int[] nums = new int[n+1];
		System.out.println("Enter the numbers");
		for(int i=1;i<=n;i++)
		{
			nums[i] = scan.nextInt();
		}
		System.out.println("Enter window size");
		int size = scan.nextInt();
		int maxArraySize = n-size+1;
		int[] maxArray = new int[maxArraySize+1];
		int[] maxLeft = new int[n+1];
		int[] maxRight = new int[n+1];

		for(int i=1;i<=n;i++)
		{
			if(i%size==1)
			{
				maxLeft[i] = nums[i];
			}
			else
			{
				maxLeft[i] = nums[i]>maxLeft[i-1]?nums[i]:maxLeft[i-1];
			}
		}

		for(int i=n;i>=1;i--)
		{
			if(i==n)
			{
				maxRight[i] = nums[i];
			}
			else if(i%size==0)
			{
				maxRight[i] = nums[i];
			}
			else
			{
				maxRight[i] = maxRight[i+1]>nums[i]?maxRight[i+1]:nums[i];
			}
		}

		for(int i=1;i<=maxArraySize;i++)
		{
			maxArray[i] = maxRight[i]>maxLeft[i+size-1]?maxRight[i]:maxLeft[i+size-1];
		}

		for(int i=1;i<maxArray.length;i++)
		{
			System.out.print(maxArray[i] + " ");
		}
	}
}