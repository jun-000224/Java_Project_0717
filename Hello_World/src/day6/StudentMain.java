package day6;

public class StudentMain {

	public static void main(String[] args) {
		
		Student yu = new Student(1357, "유재석", "컴퓨터공학과");
		
		Student hong = new Student(1234, "홍길동");
		
		hong.setInfo(28, "남");
		int age = hong.getAge();
		System.out.println(age);
		
		yu.stuInfo();
		}
	}


