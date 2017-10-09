package CTCI;

import java.util.Scanner;

class LinkedListSumLists
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Node<Integer> list = null;
		System.out.println("Enter first linkedlist data. Enter -1 to stop");
		int data = scan.nextInt();
		while(data!=-1)
		{
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = data;
			newNode.next = null;

			if(list == null)
			{
				list = newNode;
			}
			else
			{
				Node<Integer> cur = list;
				while(cur.next!=null)
				{
					cur = cur.next;
				}

				cur.next = newNode;
			}
			data = scan.nextInt();
		}



		Node<Integer> list2 = null;
		System.out.println("Enter second linkedlist data. Enter -1 to stop");
		data = scan.nextInt();
		while(data!=-1)
		{
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = data;
			newNode.next = null;

			if(list2 == null)
			{
				list2 = newNode;
			}
			else
			{
				Node<Integer> cur = list2;
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

		Node<Integer> list3 = sumLists2(list, list2);

		display(list3);
		
		scan.close();
	}

	public static void display(Node<Integer>  list)
	{
		Node<Integer> cur = list;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static Node<Integer> sumLists2(Node<Integer> list1, Node<Integer> list2)
	{
		Node<Integer> cur1 = list1;
		Node<Integer> cur2 = list2;
		int sum = 0;
		int prev = 0;
		Node<Integer> list3 = null;
		while(cur1!=null || cur2!=null)
		{
			if(cur1!=null)
			{
				sum = cur1.data;
			}
			if(cur2!=null)
			{
				sum += cur2.data;
			}
			sum += prev;
			int data = sum % 10;
			sum = sum/10;
			prev = sum;
			sum = 0;
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = data;
			newNode.next = null;

			if(list3 == null)
			{
				list3 = newNode;
			}
			else
			{
				Node<Integer> nCur = list3;
				while(nCur.next!=null)
				{
					nCur = nCur.next;
				}
				nCur.next = newNode;
			}
			if(cur1!=null)
			{
				cur1 = cur1.next;
			}
			if(cur2!=null)
			{
				cur2 = cur2.next;
			}
		}
		if(prev!=0)
		{
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = prev;
			newNode.next = null;

			if(list3 == null)
			{
				list3 = newNode;
			}
			else
			{
				Node<Integer> nCur = list3;
				while(nCur.next!=null)
				{
					nCur = nCur.next;
				}
				nCur.next = newNode;
			}
		}
		return list3;
	}

	public static Node<Integer> sumLists(Node<Integer> list1, Node<Integer> list2)
	{
		StringBuilder sb = new StringBuilder();

		Node<Integer> cur1 = list1;
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
		Node<Integer> list3 = null;
		int n;
		while(sum>0)
		{
			n = sum % 10;
			sum = sum/10;
			Node<Integer> newNode = new Node<Integer>();
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