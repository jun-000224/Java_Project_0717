package day14;

import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {
	public static void main(String[] args) {
		
		//List + Map
		//사용자로부터 이름, 나이를 입력받아서
		//3명의 정보를 map으로 만든 후 list에 저장하는 코드 작성
		
		Scanner s = new Scanner(System.in);
		
		Object list;
		for(int i = 0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("이름 :ㅣ");
			String nmae = s.next();
			System.out.println("이름 :ㅣ");
			int age  = s.nextInt();
			map.put("age", age);
			list.add(map);
		}
		System.out.println(list);
		}
}
