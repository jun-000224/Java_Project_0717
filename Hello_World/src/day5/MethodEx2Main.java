package day5;

import java.util.Random;

public class MethodEx2Main {

	public static void main(String[] args) {
		MethodEx2 m = new MethodEx2();
		
		//동일한 이름에 메소드를 여러개 작성해게 해줌 -> 오버로딩
		m.sum(1, 5);
		m.sum(3.5, 2.5);
		m.sum(1.5, 4);
		m.sum(3, 5, 9);
		
		Random ran = new Random();
		
	}

}
