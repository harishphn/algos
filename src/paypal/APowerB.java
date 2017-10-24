import  java.util.Scanner;
public class APowerB
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("Enter power");
		int b = scan.nextInt();

		System.out.println("Power is: " + calPower(a, b));
	}

	public static double calPower(int a, int b)
	{
		boolean isNeg = false;
		if(b<0)
		{
			isNeg = true;
			b *= -1;
		}
		double pow = 1;
		for(int i=1;i<=b;i++)
		{
			pow *= a;
		}
		if(isNeg)
		{
			return 1/pow;
		}
		else
		{
			return pow;
		}
	}
}