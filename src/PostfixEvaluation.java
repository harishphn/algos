import java.util.Scanner;

public class PostfixEvaluation
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter postfix expression");
		String postfix = scan.next();

		try
		{
			System.out.println("Evaluated result: " + evaluatePostfix(postfix));
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		scan.close();
	}

	public static int evaluatePostfix(String postfix) throws Exception
	{
		MyStack<Integer> stk = new  MyStack<Integer>();
		for(int i=0;i<postfix.length();i++)
		{
			char ch = postfix.charAt(i);
			if(Character.isDigit(ch))
			{
				int num = Character.getNumericValue(ch);
				stk.push(num);
			}
			else
			{
				int num1 = stk.pop();
				int num2 = stk.pop();
				int res = -1;
				switch(ch)
				{
					case '+': 
							res = num2 + num1;
							break;
					case '-':
							res = num2 - num1;
							break;
					case '*':
							res = num2 * num1;
							break;
					case '/':
							res = num2 / num1;
							break;
				}
				stk.push(res);
			}

		}
		return stk.pop();
	}
}