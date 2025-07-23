package day6;

public class Human {
	//생성자에서 this()의 활용
	//생성자에서 this()메소드는 다른 생성자를 호출하는데 사용
	
	//필드 영역
	String name;
	int age;
	double height;
	
	
	//생성자 영역
	Human(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}	
	
	private Human(String name, int age){
		this(name, age, 0.0); //this는 꼭 첫줄에만 사용하기
		
	}
	
	Human(String name){
		this.name = name;
	}
	
}