package day5;

public class HumanMain {
	
	public static void main(String[] args) {
		Human moving = new Human("홍길동", 30);
		moving.eat();
		System.out.println(moving.name);
		
		Human kim = new Human("김철수", 25, "서울");
		kim.study();
		System.out.println(kim.name);
		
		Human park = new Human("박영희", 20);
		park.eat();
		
		
		
	}

}
