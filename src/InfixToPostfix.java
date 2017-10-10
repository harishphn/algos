import java.util.Scanner;

public class InfixToPostfix
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter infix expression");
		String infix = scan.next();

		try
		{
			System.out.println("Postfix expression is: " + toPostfix(infix));
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		scan.close();
	}

	public static String toPostfix(String infix) throws Exception
	{
		StringBuilder sb = new StringBuilder();
		MyStack<Character> stk = new  MyStack<Character>();

		System.out.println(infix.length());

		for(int i=0;i<infix.length();i++)
		{
			if(Character.isLetterOrDigit(infix.charAt(i)))
			{
				sb.append(infix.charAt(i));
			}
			else if(stk.isEmpty() || stk.peek()=='(')
			{
				stk.push(infix.charAt(i));
			}
			else if(infix.charAt(i)=='(')
			{
				stk.push(infix.charAt(i));
			}
			else if(infix.charAt(i)==')')
			{
				while((!stk.isEmpty()) && (stk.peek() != '('))
				{
					sb.append(stk.pop());
				}
				if((!stk.isEmpty()) && (stk.peek()=='('))
				{
					stk.pop();
				}
			}
			else if(prec(infix.charAt(i), stk.peek())>0)
			{
					stk.push(infix.charAt(i));
			}
			else if(prec(infix.charAt(i), stk.peek())<=0)
			{
				while((!stk.isEmpty()) && (prec(infix.charAt(i), stk.peek())<=0))
				{
					sb.append(stk.pop());
				}
				stk.push(infix.charAt(i));
			}
		}
		while(!stk.isEmpty())
		{
			sb.append(stk.pop());
		}
		System.out.println(infix.length());
		return sb.toString();
	}

	public static int prec(char incoming, char stkTop)
	{
		if((incoming=='*' || incoming=='/') && (stkTop=='+' || stkTop=='-'))
		{
			return 1;
		}
		if(incoming==stkTop)
		{
			return 0;
		}
		return -1;
	}
}