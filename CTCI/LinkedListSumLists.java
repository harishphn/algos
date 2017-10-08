import java.util.Scanner;

class Node
{
	public int data;
	public Node next;
}

class LinkedListSumLists
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Node list = null;
		System.out.println("Enter first linkedlist data. Enter -1 to stop");
		int data = scan.nextInt();
		while(data!=-1)
		{
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = null;

			if(list == null)
			{
				list = newNode;
			}
			else
			{
				Node cur = list;
				while(cur.next!=null)
				{
					cur = cur.next;
				}

				cur.next = newNode;
			}
			data = scan.nextInt();
		}



		Node list2 = null;
		System.out.println("Enter second linkedlist data. Enter -1 to stop");
		data = scan.nextInt();
		while(data!=-1)
		{
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = null;

			if(list2 == null)
			{
				list2 = newNode;
			}
			else
			{
				Node cur = list2;
				while(cur.next!=null)
				{
					cur = cur.next;
				}

				cur.next = newNode;
			}
			data = scan.nextInt();
		}



		System.out.println("Given linkedlists data");

		display(list);

		display(list2);

		Node list3 = sumLists(list, list2);

		display(list3);
	}

	public static void display(Node  list)
	{
		Node cur = list;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static Node sumLists(Node list1, Node list2)
	{
		StringBuilder sb = new StringBuilder();

		Node cur1 = list1;
		while(cur1!=null)
		{
			sb.append(Integer.toString(cur1.data));
			cur1 = cur1.next;
		}
		sb.reverse();
		int num1 = Integer.parseInt(sb.toString());
		sb.setLength(0);

		cur1 = list2;
		while(cur1!=null)
		{
			sb.append(Integer.toString(cur1.data));
			cur1 = cur1.next;
		}
		sb.reverse();
		int num2 = Integer.parseInt(sb.toString());
		sb.setLength(0);

		int sum = num1+num2;
		sb.append(sum);
		sb.reverse();
		sum = Integer.parseInt(sb.toString());
		Node list3 = null;
		int n;
		while(sum>0)
		{
			n = sum % 10;
			sum = sum/10;
			Node newNode = new Node();
			newNode.data = n;
			newNode.next = null;
			if(list3 == null)
			{
				list3 = newNode;
			}
			else
			{
				newNode.next = list3;
				list3 = newNode;
			}
		} 

		return list3;
	}
}