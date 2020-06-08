import java.util.ArrayList;

public class DSArrayList {
    public static void main(String[] args) {
		/*
		ArrayList inherits AbstractList class and implements List interface.
		ArrayList is initialized by a size, however the size can increase if collection grows or shrunk if objects are removed from the collection.
		Java ArrayList allows us to randomly access the list.
		ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
		ArrayList in Java can be seen as similar to vector in C++.
		*/


        //ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Size of AL: " + al.size());
        al.add(33);
        al.add(1);
        al.add(15);
        al.add(1, 22);
        al.add(34);
        al.add(56);
        al.remove(2); //index 2
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        //System.out.println("Contents of Array List: " + al);
    }
}