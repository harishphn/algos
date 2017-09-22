import java.util.Scanner;
import java.util.HashSet;

public class CheckIfStringIsUnique
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String  str = scan.next();
		System.out.println("String is unique: " + isUnique(str));
		System.out.println("String is unique: " + isUniqueWithBits(str));
	}

	public static boolean isUnique(String str)
	{
		HashSet<Character> hset = new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(!hset.add(str.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isUniqueWithBits(String str)
	{
		int checker = 0;

		for(int i=0;i<str.length();i++)
		{
			int bit = str.charAt(i) - 'a';
			if((checker & 1 << bit) > 0)
			{
				return false;
			}
			checker |= (1 << bit);
		}
		return true;
	}

}