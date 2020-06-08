import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DSTreeMap {
    public static void main(String[] args) {

        //http://www.geeksforgeeks.org/differences-treemap-hashmap-linkedhashmap-java/

        //TreeMap - It creates maps stored in a tree structure.
        //A TreeMap provides an efficient means of storing key/value pairs in sorted order and allows rapid retrieval.
		/*
		A TreeMap contains values based on the key. 
		It implements the NavigableMap interface and extends AbstractMap class.
		It contains only unique elements.
		It cannot have null key but can have multiple null values.
		It is same as HashMap instead maintains ascending order.
		*/


        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        tm.put("Ross Geller", new Double(1.11));
        tm.put("John Reese", new Double(3.14));
        tm.put("Neal Caffrey", new Double(1.43));
        tm.put("John Snow", new Double(1.00));

        Set<Map.Entry<String, Double>> tsset = tm.entrySet();
        for (Map.Entry<String, Double> entry : tsset) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        tm.put("Ross Geller", tm.get("Ross Geller") + 1.0);
        System.out.println("Ross's new balance: " + tm.get("Ross Geller"));
    }
}