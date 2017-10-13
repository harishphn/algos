import java.util.Scanner;

class CheckIfTreeIsBalanced
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter numbers. Enter -100 to stop");

		int num = scan.nextInt();
		MyBSTNode<Integer> root = null;
		do
		{
			if(root == null)
			{
				root = new MyBSTNode<Integer>(num);
			}
			else
			{
				root.insert(num);
			}
			BTreePrinter.printNode(root);
			System.out.println();
			num = scan.nextInt();
		}while(num!=-100);
		System.out.println("Is height balanced: " + isHeightBalanced(root));
	}

	public static boolean isHeightBalanced(MyBSTNode<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		if(Math.abs(height(root.left)-height(root.right)) > 1)
		{
			return false;
		}
		return isHeightBalanced(root.left) && isHeightBalanced(root.right);
	}

	public static int height(MyBSTNode<Integer> node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			return (1 + Math.max(height(node.left),height(node.right)));
		}
	}
}