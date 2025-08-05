package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		
		ArrayList<HashMap<String, Object>> list
			= new ArrayList<>();
		
		for(int i = 0; i <3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 :  ");
			String name = s.next();
			map.put("name", name);
			
			System.out.print("나이 :  ");
			int age = s.nextInt();
			map.put("age",  age);
			
			
			System.out.print("주소 :  ");
			String addr = s.next();
			map.put("addr", addr);
			list.add(map);
		}
		System.out.println(list);
		//출력
		for(int i=0; i<list.size(); i ++) {
			HashMap<String, Object> user= list.get(i);
			System.out.println(user.get("name"));
//			System.out.println(list.get(i).get("name")); -> 이렇게도 간단하게 작성 가능.
		}
		
		System.out.println("검색할 사람 입력 : ");
		String name = s.next();
		for(int i = 0; i<list.size(); i ++) {
			HashMap<String, Object> user= list.get(i);
			if(name.equals(user.get("name"))) {
				System.out.println("찾았다!");
			}
		}
		
	}

}
