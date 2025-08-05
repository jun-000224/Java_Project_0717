package day13;

import java.util.HashMap;

public class MapEx1 {

	public static void main(String[] args) {
		
//		HashMap<String, String> map = new HashMap<>();
//		map.put("apple", "사과");
//		map.put("java", "자바");
//		
//		System.out.println(map);
//		System.out.println(map.get("사과"));  //벨류가 아닌 '키'값으로 찾아야함. 
		
		
		HashMap <String, Object>map = new HashMap<String, Object>();
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("hegiht", 170.5);
		map.put("isMarried", true);
		System.out.println(map);
	}

}
