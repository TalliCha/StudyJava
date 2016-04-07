import java.util.HashMap;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, Integer> test1 = new HashMap<>();
		
		test1.put(1, 5);
		System.out.println(test1.get(1));
		
		
		test1.put(1, 3);
		System.out.println(test1.get(1));
		
		test1.put(1, 7);
		System.out.println(test1.get(1));
		
		TreeMap<Integer, Integer> test2 = new TreeMap<>();
		
		test2.put(1, 5);
		System.out.println(test2.get(1));
		
		
		test2.put(1, 3);
		System.out.println(test2.get(1));
		
		test2.put(1, 7);
		System.out.println(test2.get(1));
		
	}
}
