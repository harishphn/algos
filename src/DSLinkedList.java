import java.util.LinkedList;

public class DSLinkedList {
    public static void main(String[] args) {
        //LinkedList(Its a doubly linked list implementation in Java)
		/*
		The LinkedList class extends AbstractSequentialList and implements the List interface. 
		It provides a linked-list data structure.		
		*/

        LinkedList<String> list = new LinkedList<>();
        list.add("Str1");
        list.add("Str2");
        list.add("Str3");
        list.add("Str4");
        list.addFirst("Stra");
        list.addLast("Strb");
        list.add(1, "str1a");
        list.remove("Str2");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


        //System.out.println("Contents of Linked List: " + list);
        //removeFirst()
        //removeLast()
        //get(index)
        //set(index, value)
    }
}