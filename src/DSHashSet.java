import java.util.HashSet;
import java.util.Iterator;

public class DSHashSet {
    public static void main(String[] args) {
        //HashSet - no order maintained. unique.
        HashSet<String> hset = new HashSet<String>();
        hset.add("ross");
        hset.add("monica");
        hset.add("rachel");
        hset.add("chandler");
        hset.add("joey");
        hset.add("phoebe");
        //System.out.println(hset);
        Iterator<String> it = hset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}