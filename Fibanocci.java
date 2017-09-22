import java.util.Scanner;

public class Fibanocci
{
	public static void main(String[] args)
	{
		//DP: Fibanocci
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter fib position");
		int pos = scan.nextInt();
		fibanocci(pos);
	}

	public static void fibanocci(int n)
	{
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=n;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}

		System.out.println("Fibanocci result: " + fib[n]);
	}
}