package day5;

public class Person {

	String name;
	int age;
	//Person(){}기본 생성자는 다른 생성자를 하나도 정의하지 않으면 자동 생성
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은 " + name + ", 나이는 "+ age;
	}
}

//ㅅ