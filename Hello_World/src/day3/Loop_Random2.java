package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random2 {

	public static void main(String[] args) {
		//랜덤 구구단 문제를 5문제 출제하고 싶음. 정오답 체크까지
		//5문제를 다 푼 후에, 한 문제당 20점으로 가정하고 채점까지.
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
	
		int score = 0;
		
		for(int i =1; i <=5; i++) {
			int x = ran.nextInt(8)+2; //2~9
			int y = ran.nextInt(9)+1; //1~9
			System.out.println(i + "번 : " + x + "*" + y + "=");
			int answer = s.nextInt();
			if (answer == (x*y)) {
				System.out.println("정답입니다.");
				score += 20;
			}else {
				System.out.println("오답입니다.");
			}
		}
		System.err.println("최종 귀하의 점수는 " + score + "점 입니다.");
	
	}

}
