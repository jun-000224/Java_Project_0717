package day6;

public class Human_Review {
	//클래스 = 필드(변수) + 메소드
	//클래스는 객체를 만드는 도구(틀)
	//클래스는 실체화(구체화)되지 않은 상태. 직접 사용은 거의 불가능.
	//(나중에 static 개념을 배우면 부분적으로 직접 사용이 가능함.)
	
	
	//필드 영역
	String name;
	int age;
	double height;
	
	
	//생성자 영역
	//1. 클래스 이름과 동일한 메소드이다.
	//2. 객체를 초기화하는 목적을 가지고 있다.
	//3. 리턴값이 없다.
	//4. 오버로딩이 가능하다.
	//5. 클래스를 통해 객체를 만들때 꼭 한 번 호출된다. 
	Human_Review(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
		
	}
	
	
	//메소드
	void intro() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	String getName() {
		System.out.println("이름 정보를 전달합니다.");
		return name;
	}
	
	int age() {
		System.out.println("나이 정보를 저장합니다.");
		return age;
	}
	
}
