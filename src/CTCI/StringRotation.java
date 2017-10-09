package CTCI;
import java.util.Scanner;

public class StringRotation
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scan.next();
		System.out.println("Enter second string");
		String str2 = scan.next();
		String str11 =str1 + str1;
		if(str11.indexOf(str2)!=-1)
		{
			System.out.println("Second string is a rotation of first one");
		}
		else
		{
			System.out.println("Not a rotation");
		}
		scan.close();
	}
}
