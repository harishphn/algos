import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		System.out.println(getLongestUniqueString(str));
	}

	public static String getLongestUniqueString(String str)
	{
		StringBuilder strBldr = new StringBuilder();
		if(str.length()==0)
		{
			return "";
		}
		HashSet<Character> lhs = new HashSet<Character>();
		String unique = "";
		String last = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(lhs.add(ch))
			{
				strBldr.append(ch);
			}
			else
			{
				last = strBldr.toString();
				if(unique.length()<last.length())
				{
					unique = last;
				}
				int dupIdx = last.indexOf(ch);
				strBldr.setLength(0);
				lhs.clear();
				if(dupIdx<last.length()-1)
				{
					String temp = last.substring(dupIdx+1);
					strBldr.append(temp);
					for(int k=0;k<temp.length();k++)
					{
						lhs.add(temp.charAt(k));
					}	
				}
				strBldr.append(ch);
				lhs.add(ch);

			}
		}
		String unique2 = strBldr.toString();
		if(unique.length()<unique2.length())
		{
			return unique2;
		}
		else
		{
			return unique;
		}
	}
}