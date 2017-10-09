package CTCI;

import java.util.Scanner;


class LinkedListCheckPalindrome
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Node<Character> list = null;
		System.out.println("Enter linkedlist data. Enter -1 to stop");
		char data = scan.next().charAt(0);
		while(data!='X')
		{
			Node<Character> newNode = new Node<Character>();
			newNode.data = data;
			newNode.next = null;

			if(list == null)
			{
				list = newNode;
			}
			else
			{
				Node<Character> cur = list;
				while(cur.next!=null)
				{
					cur = cur.next;
				}

				cur.next = newNode;
			}
			data = scan.next().charAt(0);
		}

		System.out.println("Given linkedlist data");

		Node<Character> cur = list;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}

		System.out.println("\nGiven linked list is a palindrome: " + isPalindrome(list));
		
		scan.close();
	}

	public static void display(Node<Character>  list)
	{
		Node<Character> cur = list;
		while(cur!=null)
		{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
	}

	public static boolean isPalindrome(Node<Character> list)
	{
		if(list == null)
		{
			return false;
		}

		Node<Character> tempList = null;

		Node<Character> cur = list;

		while(cur!=null)
		{
			Node<Character> newNode = new Node<Character>();
			newNode.data = cur.data;
			newNode.next = null;

			if(tempList == null)
			{
				tempList = newNode;
			}
			else
			{
				newNode.next = tempList;
				tempList = newNode;
			}
			cur= cur.next;
		}

		cur = list;
		Node<Character> tCur = tempList;
		while(cur!=null)
		{
			if(cur.data!=tCur.data)
			{
				return false;
			}
			cur = cur.next;
			tCur = tCur.next;
		}

		return true;
	}
}