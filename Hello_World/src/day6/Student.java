package day6;

public class Student {

	//필드
	private int stuNu;
	private String stuName;
	private String stuDept;
	private int age;
	private String gender;
	
	
	//생성자
	
	Student(int stuNu, String stuName) {
		this.stuNu = stuNu;
		this.stuName = stuName;
	}
	
	Student(int stuNu, String stuName, String stuDept) {
		this.stuNu = stuNu;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	
	//메소드
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	
	int getAge() {
		return age;
	}
	
	
	void stuInfo() {
		System.out.println(stuName+ " 학생의 학번은 " + stuNu + " 나이는 " + age + "입니다.");
	}
}
