import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LRUCache extends LinkedHashMap<Integer, String>
{
	private int capacity;


	public LRUCache(int capacity, float loadFactor)
	{
		super(capacity, loadFactor, true);
		this.capacity = capacity;
	}

	protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest)
	{
		return size() > this.capacity;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the cache size");
		int n = scan.nextInt();
		LRUCache lru = new LRUCache(n, 0.75f);
		lru.put(1, "O1");
		lru.put(2, "O2");
		lru.put(3, "O3");
		lru.get(1);
		lru.put(4, "O4");
		System.out.println(lru);
		lru.put(5, "O5");
		lru.get(3);
		lru.put(6, "O6");
		System.out.println(lru);
		lru.get(4);
		lru.put(7, "O7");
		lru.put(8, "O8");
		System.out.println(lru);
	}
}