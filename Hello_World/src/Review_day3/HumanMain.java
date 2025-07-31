package Review_day3;

public class HumanMain {

	public static void main(String[] args) {
		
//		Human hong; 이렇게 먼저 선언해놓고 hong = new Human()해도 됨. 
//		Human hong = new Human();
//		
//		hong.name = "홍길동";
//		hong.eat();
//		hong.money = 10000;
//		
//		
//		System.out.println(hong.name);
//		System.out.println(hong.money);
//		
//		Human kim = new Human();
//		kim.name = "김철수";
//		System.out.println(kim.money);
		
		Human hong = new Human("홍길동", 30, "인천", 10000);
		System.out.println(hong.name);
		
		Human park = new Human("박영희", 20000); //이름, 소유 금액
		Human yu = new Human("유재석", 40, "제주도"); //이름 나이, 주소

		
	}

}
