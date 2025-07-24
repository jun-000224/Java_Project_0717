package day7;

public class FruitMain {
	
	//업캐스팅 -> 사과, 오렌지, 바나나는 '과일'이다.
	Fruit goldApple = new Apple("황금사과", 20000);
	
	Fruit jejuOrange = new Orange("제주오렌지", 5000);
	
	Fruit banana = new Banana("골드바나나", 7000);
	
	public static void fruitBoxing(Fruit f, int num) { //이걸 선언함으로서 업캐스팅이 가능함
		System.out.println(f.name + "(을)를 " + num + "개 포장했습니다.");   // 사과, 오렌지, 바나나를 과일 박스에 넣기가 가능
	}

	
	
	
	
//	public static void appleBoxing(Apple a, int num) { //Apple을 파라미터로 받아오기
//		System.out.println(a.name + "(을)를 " + num + "개 포장했습니다.");
//	}
//	
//	
//	public static void orangeBoxing(Orange o, int num) { 
//		System.out.println(o.name + "(을)를 " + num + "개 포장했습니다.");
//	}
//	
//	
//	public static void bananaBoxing(Banana b, int num) { 
//		System.out.println(b.name + "(을)를 " + num + "개 포장했습니다.");
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		Apple apple = new Apple("사과", 1000);
//		fruitBoxing(apple, 3); //Apple클래스로 만든 객체만 넣을 수 있음. 위의 메소드에서 Apple a로 지정했기 때문
//		
//		Orange orange = new Orange("오렌지", 1500);
//		orangeBoxing(orange, 120);
//		
//		
//		Banana banana = new Banana("바나나", 500);
//		bananaBoxing(banana, 30);
//		
		
		
	}

}
