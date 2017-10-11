import java.util.Scanner;

public class LongestCommonSubsequence
{
	public static void main(String[] args)
	{
		//DP: Longest Common Subsequence
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1 ");
		String str1 = scan.next();
		System.out.println("Enter String 2 ");
		String str2 = scan.next();
		LCS(str1, str2);
	}

	public static void LCS(String str1, String str2)
	{
		//ArrayList<Character> sb = new ArrayList<Character>();
		if(str1.length()!=0 && str2.length()!=0)
		{
			int[][] table = new int[str1.length()+1][str2.length()+1];
			for(int i=0;i<=str1.length();i++)
			{
				table[i][0] = 0;
			}
			for(int j=0;j<=str2.length();j++)
			{
				table[0][j] = 0;
			}

			for(int i=1;i<=str1.length();i++)
			{
				for(int j=1;j<=str2.length();j++)
				{
					if(str1.charAt(i-1) == str2.charAt(j-1))
					{
						table[i][j] = 1 + table[i-1][j-1];
					}
					else
					{
						table[i][j] = table[i-1][j] < table[i][j-1] ? table[i][j-1] : table[i-1][j];
					}
				}
			}

			System.out.println("Length of LCS: " + table[str1.length()][str2.length()]);
			/*System.out.print("LCS: ");
			for(char x: sb)
			{
				System.out.print(x);
			}
			System.out.println();*/
		}
	}
}