package day15;

import java.util.HashMap;
import java.util.Set;

public class MapKeySet {

	public static void main(String[] args) {
		
		HashMap<String, Object> user1 = new HashMap<>();
		user1.put("name", "홍길동");
		user1.put("age", 30);
		user1.put("height", 170.5);
		user1.put("isMarried", true);
		
	    Set<String> keys = user1.keySet();
	    for(String key : keys) {
//	    	System.out.println(key);
	    	System.out.println(user1.get(key));
	    }
		
	}

}
