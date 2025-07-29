package Quiz;

public class Student {
	
	String name;
	int[] score;
	
	Student(String x, int num){
		this.name = x;
		this.score = new int[num];
	}
	
	public void setScore(int index, int s) {
		this.score[index] = s;
	}

}
