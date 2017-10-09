package CTCI;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PalindromePermutation
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		char[] sChars = str.toCharArray();
		for(int i=0;i<sChars.length;i++)
		{
			if(sChars[i] != ' ')
			{
				if(hmap.containsKey(sChars[i]))
				{
					hmap.put(sChars[i], hmap.get(sChars[i])+1);
				}
				else
				{
					hmap.put(sChars[i], 1);
				}
			}
		}
		int count=0;

		Set<Map.Entry<Character, Integer>> set = hmap.entrySet();
		for(Map.Entry<Character, Integer> entry : set)
		{
			if(entry.getValue()%2!=0)
			{
				count++;
			}
		}

		//System.out.println(count);
		//System.out.println(trueLength);
		if(count!=1)
		{
			System.out.println("Not a palindrome permutation");
		}
		else
		{
			System.out.println("Is a palindrome permutation");
		}
		
		scan.close();
	}
}