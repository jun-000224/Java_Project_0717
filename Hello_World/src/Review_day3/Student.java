package Review_day3;

public class Student extends Person{
	
	
	int stuNo;
	
	public Student(String name, int age, String addr, int stuNo) {
		super(name, age, addr);
		this.stuNo = stuNo;
	}

	public void study() {
		System.out.println("공부를 한다.");
	
	}
	

}
