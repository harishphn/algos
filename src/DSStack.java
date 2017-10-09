import java.util.ArrayDeque;

public class DSStack
{
	public static void main(String[] args)
	{
		//Stack
		ArrayDeque<String> stack = new ArrayDeque<String>();
		stack.push("SA");
		stack.push("SB");
		stack.push("SC");
		stack.push("SD");
		stack.push("SE");
		stack.push("SF");
		while(stack.peek()!=null)
		{
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
}