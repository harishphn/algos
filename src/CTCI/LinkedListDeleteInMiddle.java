package CTCI;

import java.util.Scanner;


public class LinkedListDeleteInMiddle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node<Integer> list = null;
        System.out.println("Enter linkedlist data. Enter -1 to stop");
        int data = scan.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>();
            newNode.data = data;
            newNode.next = null;

            if (list == null) {
                list = newNode;
            } else {
                Node<Integer> cur = list;
                while (cur.next != null) {
                    cur = cur.next;
                }

                cur.next = newNode;
            }
            data = scan.nextInt();
        }

        System.out.println("Given linkedlist data");

        displayList(list);

        System.out.println("Enter the element to be removed (not first, not last)");

        int element = scan.nextInt();

        deleteInMiddle(list, element);

        System.out.println("After deletion");

        displayList(list);

        scan.close();

    }

    public static void displayList(Node<Integer> list) {
        Node<Integer> cur = list;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void deleteInMiddle(Node<Integer> list, int element) {
        if (list == null) {
            return;
        }

        Node<Integer> cur = list;

        if (cur.data == element) {
            System.out.println("Entered element is at the beginning of list. Nothing removed.");
            return;
        }

        Node<Integer> prev = list;
        cur = cur.next;

        while (cur != null) {
            if (cur.data == element) {
                prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        }

        System.out.println("Entered element is at the end of list. Nothing removed.");
    }
}