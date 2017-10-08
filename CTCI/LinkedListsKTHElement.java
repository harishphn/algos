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

		System.out.println("\nEnter the linked list position from the end");

		int pos = scan.nextInt();

		System.out.println("element " + pos + " from end is: " + getKthElement(list, pos));
		
	}

	public static int getKthElement(Node list, int pos)
	{
		if(list==null)
		{
			return -1;
		}

		Node cur = list;
		int count = 0;

		while(cur!=null)
		{
			cur=cur.next;
			count++;
		}

		if(pos>count)
		{
			return -1;
		}

		int temp = count-pos;

		cur = list;

		while(temp>0)
		{
			cur = cur.next;
			temp--;
		}

		/*Node fast = list;
		int count = 1;

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
		System.out.println("Middle element is " + cur.data);*/


		return cur.data;
	}
}