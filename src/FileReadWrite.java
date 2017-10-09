import java.io.*;

public class FileReadWrite
{
	public static void main(String[] args)
	{
		fileIO();
	}

	public static void fileIO()
	{
		try(BufferedReader reader = new BufferedReader(new FileReader("Test.java")); BufferedWriter writer = new BufferedWriter(new FileWriter("MyOut.java")))
		{
			
			String line = "";
			while((line = reader.readLine())!=null)
			{
				System.out.println(line);
				writer.write(line);
				writer.newLine();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}