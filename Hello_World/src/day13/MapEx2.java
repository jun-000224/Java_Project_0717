package day13;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx2 {
	
	public static void main(String[] args) {
		
		//유저1
		HashMap <String, Object>user1 = new HashMap<String, Object>();
		user1.put("name", "홍길동");
		user1.put("age", 30);
		user1.put("hegiht", 170.5);
		user1.put("isMarried", true);
		
		//유저2
		HashMap <String, Object>user2 = new HashMap<String, Object>();
		user2.put("name", "홍길서");
		user2.put("age", 31);
		user2.put("hegiht", 160.5);
		user2.put("isMarried", true);
		
		//유저3
		HashMap <String, Object>user3 = new HashMap<String, Object>();
		user3.put("name", "홍길남");
		user3.put("age", 35);
		user3.put("hegiht", 180.7);
		user3.put("isMarried", false);

		
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
		ArrayList<HashMap <String, Object>> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		System.out.println(list);
		
		
	}

}
