package day13;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {

		ArrayList<Human> list = new ArrayList<>();
		
		Human hong = new Human("홍길동", 30, "인천");
		list.add(hong);

		Human kim = new Human("김철수", 25, "서울");
		
		Human park = new Human("박영희", 20, "제주도");
		
		list.add(kim);
		list.add(park);
		
		for(int i = 0; i<list.size(); i++) {
			Human human = list.get(i);
			System.out.println(human.getName());
			
//			System.out.println(list.get(i).getName()); 으로도 표현 가능
		}
		
	}

}
