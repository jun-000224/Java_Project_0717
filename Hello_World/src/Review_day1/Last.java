package Review_day1;

import java.util.Random;

public class Last {

	public static void main(String[] args) {
		
		String[] subjectArr = {"JAVA", "oracle", "html", "javascript", "css"};
		int[] scoreArr = {90,85, 60, 95,100};
		
		for(int i=0; i<subjectArr.length; i++) {
			System.out.println("과목명 : " + subjectArr[i]);
			System.out.println("점수 : " + scoreArr[i]);
		}
		
		Object[] obj = {1, 1.5, "홍길동", true, new Random()};
	}

}
