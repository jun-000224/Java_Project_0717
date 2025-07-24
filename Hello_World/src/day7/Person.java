package day7;

public class Person {
	String name;
	int age;
	String addr;
	double height;
	String gender;
	
	Person(){
		System.out.println("Person의 기본 생성자 호출");
	}

	Person(String name, int age, String addr, double height, String gender){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
		this.gender = gender;
	}
	
	Person(String name, int age, String addr, double height){
		this(name, age, addr, height, "");
	}
	
	void eat() {
		System.out.println(name + "이가 밥을 먹는다");
	}
	
	void speak() {
		System.out.println(name + "이가 말을 한다");
	}
}
