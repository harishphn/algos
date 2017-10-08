import java.util.Scanner;

class Node
{
	public int data;
	public Node next;
}

class LinkedListPartitionAroundX
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Node list = null;
		System.out.println("Enter linkedlist data. Enter -1 to stop");
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

		System.out.println("Given linkedlist data");

		Node cur = list;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}

		System.out.println("\nEnter parition element");

		int par = scan.nextInt();

		System.out.println("\nLinkedlist data after partition around " + par);

		partitionList(list, par);
		
	}

	public static void display(Node  list)
	{
		Node cur = list;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
	}

	public static void partitionList(Node list, int x)
	{
		Node tempList = null;
		Node cur = list;
		Node match = null;
		Node prev = null;
		while(cur!=null)
		{
			if(cur.data>=x)
			{
				System.out.println(cur.data);
				Node tempNode = new Node();
				tempNode.data = cur.data;
				tempNode.next = null;
				if(tempList==null)
				{
					tempList = tempNode;
				}
				else
				{
					tempNode.next = tempList;
					tempList = tempNode;
				}

				if(prev==null)
				{
					list = list.next;
					cur = list;
				}
				else
				{
					prev.next = cur.next;
					cur = prev.next;
				}
			}
			else
			{
				prev = cur;
				cur = cur.next;
			}
			
		}

		cur = tempList;
		Node iter = list;
		while(iter.next!=null)
		{
			iter = iter.next;
		}
		while(cur!=null)
		{
			Node tNode = new Node();
			tNode.data = cur.data;
			tNode.next = null;
			iter.next = tNode;
			iter = tNode;
			cur = cur.next;
		}
		display(list);
	}
}