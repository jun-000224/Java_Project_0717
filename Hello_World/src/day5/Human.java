package day5;

public class Human {
	String name;
	int age;
	String addr;
	
	//생성자 -> 클래스 이름과 동일하고 리턴 데이터 타입 X
	Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
		
		
	}
	
	void eat() {
		System.out.println(name + "(이)가 밥을 먹는다.");
	} //eat이 메소드 이름, ()있으면 메소드라고 생각하면 됨.
	void study() {
		System.out.println(name + "(이)가 공부 한다.");
	}
	

}
