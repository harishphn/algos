import java.util.Scanner;
import java.util.HashSet;

class Node
{
	public int data;
	public Node next;
}

public class LinkedListsRemoveDuplicates
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

		removeDuplicates(list);

		System.out.println("\nLinkedlist data after removing duplicates");

		cur = list;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		
	}

	public static void removeDuplicates(Node list)
	{
		HashSet<Integer> hset = new HashSet<Integer>();
		if(list == null){
			System.out.println("The list is empty.");
			return;
		}
			
		Node cur = list.next;
		Node prev = list;
		hset.add(prev.data);

		while(cur!=null)
		{
			if(hset.contains(cur.data))
			{
				//System.out.println("###prev " + prev.data);
				//System.out.println("###cur " + cur.data);
				prev.next = cur.next;
				//cur = prev.next;
			}
			else
			{
				//System.out.println("+++prev " + prev.data);
				//System.out.println("+++###cur " + cur.data);
				hset.add(cur.data);
				prev = cur;
			}
			cur = cur.next;
		}

	}
}