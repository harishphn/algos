import java.util.Scanner;

class MinimalBSTHeight
{
	public static MyBSTNode<Integer> root = null;
	public static ArrayList<Integer> alist = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter numbers. Enter -100 to stop");
		int num = scan.nextInt();
		//root = new MyBSTNode<Integer>(num);
		do
		{
			alist.add(num);
			num = scan.nextInt();
		}while(num!=-100);

		MyBSTNode<Integer> node = createBST(0, alist.size()-1);
		BTreePrinter.printNode(root);
	}

	public static MyBSTNode<Integer> createBST(int left, int right)
	{
		int mid = (left+right)/2;
		MyBSTNode<Integer> node = new MyBSTNode<Integer>(alist.get(mid));
		if(root==null)
		{
			root = node;
		}
		node.left = createBST(left, mid);
		node.right = createBST(mid, right);
		return node;
	}
}