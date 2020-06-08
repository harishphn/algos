import java.util.TreeSet;

public class DSTreeSet {
    public static void main(String[] args) {
        //TreeSet - uses tree for storage. Objects are stored in sorted, ascending order. Access
        //and retrieval times are quite fast, which makes TreeSet an excellent choice when storing
        //large amounts of sorted information that must be found quickly.

		/*
		TreeSet implements the SortedSet interface so duplicate values are not allowed.
		TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
		TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
		TreeSet allows to insert null but just once.
		TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree. 
		Therefore operations like add, remove and search take O(Log n) time. 
		And operations like printing n elements in sorted order takes O(n) time.
		*/

        TreeSet<String> tset = new TreeSet<String>();
        tset.add("ross");
        tset.add("monica");
        tset.add("rachel");
        tset.add("chandler");
        tset.add("joey");
        tset.add("phoebe");
        System.out.println(tset);
    }
}