import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DSLinkedHashMap {
    public static void main(String[] args) {
        //http://www.geeksforgeeks.org/differences-treemap-hashmap-linkedhashmap-java/

        //LinkedHashMap - It maintains a linked list of the entries in the map, in
        //the order in which they were inserted. This allows insertion-order iteration over the map.
        //You can also create a LinkedHashMap that returns its elements in the order in which they were last accessed

		/*
		Java LinkedHashMap class is Hash table and Linked list implementation of the Map interface, with predictable iteration order. 
		It inherits HashMap class and implements the Map interface.

		The important points about Java LinkedHashMap class are:

		A LinkedHashMap contains values based on the key.
		It contains only unique elements.
		It may have one null key and multiple null values.
		It is same as HashMap instead maintains insertion order.
		*/

        LinkedHashMap<String, Double> lm = new LinkedHashMap<String, Double>();
        lm.put("Ross Geller", 1.11);
        lm.put("John Reese", 3.14);
        lm.put("Neal Caffrey", 1.43);
        lm.put("John Snow", 1.00);

        Set<Map.Entry<String, Double>> liset = lm.entrySet();
        for (Map.Entry<String, Double> entry : liset) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        lm.put("Ross Geller", lm.get("Ross Geller") + 1.0);
        System.out.println("Ross's new balance: " + lm.get("Ross Geller"));
    }
}