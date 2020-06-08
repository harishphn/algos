import java.util.LinkedHashSet;

public class DSLinkedHashSet {
    public static void main(String[] args) {
        //LinkedHashSet - insertion-order maintained. unique.
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();
        lhset.add("ross");
        lhset.add("monica");
        lhset.add("rachel");
        lhset.add("chandler");
        lhset.add("joey");
        lhset.add("phoebe");
        System.out.println(lhset);
    }
}