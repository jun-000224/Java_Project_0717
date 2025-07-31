package Review_day3;

public class Human {
	
	//필드영역
	int age;
	String name;
	String addr;
	int money;
	
	//생성자
	public Human(String name) {
		System.out.println(name + "객체 생성");
	}
	
	public Human(String name, int age, String addr, int money) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.money = money;
	}
	
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public Human(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;

	}
	
	
	//메소드
	public void eat() {
		System.err.println("밥을 먹는다.");
	}
	
	public void sleep() {
		System.err.println("잔다.");
	}
	
	
	
	

}
