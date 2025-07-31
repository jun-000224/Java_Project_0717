package Review_day3;

public class Person {
	
	private String name;
	private int age;
	private String addr;
	
	
	public Person() {}
	
	
	public Person(String name, int age, String addr) {
		this.name = name; 
		this.age= age;
		this.addr=addr;
	}
	
	
	
	public void eat() {
		System.out.println("밥을 먹는다. ");
	}
	
	public void sleep() {
		System.out.println("잔다. ");
	}

}	
