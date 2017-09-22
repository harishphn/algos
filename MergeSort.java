import java.util.Scanner;

public class MergeSort
{
	public static void main(String[] args)
	{
		int[] numbers = getArray();
		display(mergesort(numbers, 0, numbers.length-1));
	}

	public static int[] mergesort(int[] nums, int left, int right)
	{
		if(left<right)
		{
			int mid = (left + right)/2;
			int[] leftArr = mergesort(nums, left, mid);
			int[] rightArr = mergesort(nums, mid+1, right);
			return merge(leftArr, rightArr);
		}
		else
		{
			int[] num = new int[1];
			num[0] = nums[left];
			return num;
		}
	}

	public static int[] merge(int[] left, int[] right)
	{
		int[] res = new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		for(i=0, j=0, k=0;i<left.length && j<right.length;)
		{
			if(left[i]<right[j])
			{
				res[k] = left[i];
				i++;
				k++;
			}
			else
			{
				res[k] = right[j];
				j++;
				k++;
			}
		}
		
		for(int p=i; p<left.length; p++)
		{
			res[k] = left[p];
			k++;
		}

		for(int p=j;p<right.length;p++)
		{
			res[k] = right[p];
			k++;
		}

		return res;

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