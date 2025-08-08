package BackUp;

public class Animal {
	String name;
	int age;
	
	
	public Animal() {
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sound() {
		System.out.println("동물 소리");
	}
}
