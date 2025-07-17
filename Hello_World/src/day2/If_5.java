package day2;

import java.util.Scanner;

public class If_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		
		int score = s.nextInt();
		System.out.println("학년을 입력하시오.");
		
		int grade = s.nextInt();
		
		if(grade >=1 && grade <= 3) {
			if(score>=80) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println("불합격입니다.");
			}
			
		}
		else if(grade >= 4 && grade <=6) {
			if(score>=60) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println("불합격입니다.");
			}
		}
		else {
			System.out.println("입력 오류입니다.");
		}

		
	}

}
