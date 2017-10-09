import java.util.Scanner;

public class CheckPrimeAndPowerOfTwo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		//Prime Number
		System.out.println("Enter a number");
		int pri = scan.nextInt();
		if(isPrime(pri))
		{
			System.out.println("Prime!");
		}
		else
		{
			System.out.println("Not Prime!");
		}

		//Power of 2
		System.out.println("Enter a number for power of 2");
		int pow = scan.nextInt();
		powerOf2(pow);
	}

	public static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}


	//case20
	public static void powerOf2(int n)
	{
		if(n<1)
		{
			return;
		}
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		int prev=1;
		System.out.println(1);
		int cur;
		for(int i=1;i<=n/2;i++)
		{
			cur = prev*2;
			if(cur<=n)
			{
				prev = cur;
				System.out.println(cur);
			}
			else
			{
				break;
			}
		}
	}
}