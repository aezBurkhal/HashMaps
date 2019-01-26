import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put (5, "five");
		map.put (6, "six");
		map.put (5, "five");
		map.put (4, "four");
		map.put (2, "two");
		
		
		
		String text = map.get(6);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}

}
