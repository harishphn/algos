import java.util.Scanner;
import java.util.HashSet;

class Node
{
	public int data;
	public Node next;
}

public class LinkedListsKTHElement
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

		System.out.println("Enter the linked list position from the end");

		int pos = scan.nextInt();

		System.out.println(pos + "th element from end is: " + getKthElement(list));
		
	}

	public static int getKthElement(Node list)
	{
		if(list==null)
		{
			return -1;
		}

		Node cur = list;
		Node fast = list;
		int count = 0;

		while(fast!=null)
		{
			if(fast.next == null)
			{
				break;
			}
			fast = fast.next.next;
			cur = cur.next;
			count++;
		}
		return count;
	}
}