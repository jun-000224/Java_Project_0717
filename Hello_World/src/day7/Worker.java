package day7;

public class Worker extends Person{
	
	Worker(){
		System.out.println("Worker 생성자 실행");
	}
	
	Worker(String name, int age, String addr, double height){
		super(name, age, addr, height);
		System.out.println("매개변수 4개짜리 Worker 생성자 실행");
	}
}