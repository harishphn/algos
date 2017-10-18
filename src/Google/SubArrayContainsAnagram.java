import java.util.Scanner;
import java.util.HashMap;

public class SubArrayContainsAnagram
{
	public static  void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		System.out.println("Contains and Anagram: " + containsAndAnagram(s1, s2));
	}
	public static boolean containsAndAnagram(String s1, String s2)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<s2.length();i++)
		{
			if(hm.containsKey(s2.charAt(i)))
			{
				hm.put(s2.charAt(i), hm.get(s2.charAt(i)) + 1);
			}
			else
			{
				hm.put(s2.charAt(i), 1);
			}	
		}
		for(int i=0;i<s1.length();i++)
		{

			if(hset.add(s1.charAt(i)))
			{
				return false;
			}
		}
		int index = s2.indexOf(s1.charAt(0));
		for(int i=1;i<s1.length();i++)
		{
			int index2 = s2.indexOf(s1.charAt(i));
			if(Math.abs(index-index2)<s1.length())
			{
				continue;
			}
			else
			{
				index = s2.substring(index).indexOf(s1.charAt(index));
				if(index==-1)
				{
					return false;
				}
			}
		}

		return true;

	}
	
}