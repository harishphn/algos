import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DSHashMap {
    public static void main(String[] args) {
        //http://www.geeksforgeeks.org/differences-treemap-hashmap-linkedhashmap-java/

		/*
		HashMap provides constant time complexity for basic operations, get and put, 
		if hash function is properly written and it disperses the elements properly among the buckets. 
		Iteration over HashMap depends on the capacity of HashMap and number of key-value pairs. 
		Basically it is directly proportional to the capacity + size. 
		Capacity is the number of buckets in HashMap. 
		So it is not a good idea to keep high number of buckets in HashMap initially.
		Performance of HashMap depends on 2 parameters:
			Initial Capacity
			Load Factor
		*/


        //HashMap - a hash table with unique keys. <key, value>
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("John Reese", new Double(3.14));
        hm.put("Neal Caffrey", new Double(1.43));
        hm.put("John Snow", new Double(1.00));
        hm.put("Ross Geller", new Double(1.11));

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        hm.put("Ross Geller", hm.get("Ross Geller") + 1.0);
        System.out.println("Ross's new balance: " + hm.get("Ross Geller"));
    }
}