import java.util.Scanner;
import java.util.ArrayList;

public class ConvertMultiDimArrayToSingleArray
{
	public static void main(String[] args)
	{
		int[][] threed = {{4, 17, 28, 38, 43, 58, 69, 77, 83}, {4, 12, 24, 35, 48, 55, 62, 73, 87}, {11,
15, 22, 36, 46, 60, 67, 80, 84}};
		convertToSingleArray(threed);
	}

	public static void convertToSingleArray(int[][] threed)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for(int i=0;i<threed.length;i++)
		{
			for(int j=0;j<threed[i].length;j++)
			{
				list.add(threed[i][j]);
			}
		}
		Object[] obj = list.toArray();
		for(Object x: obj)
		{
			System.out.print(x + " ");
		}
	}
	
}