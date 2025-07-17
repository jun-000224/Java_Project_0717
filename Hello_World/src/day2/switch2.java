package day2;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력");
		int score = scanner.nextInt();
		
		switch (score / 10) {
		
		case 10:
		case 9:
			System.out.println("A 학점 입니다.");			
			break;
		case 8:
			System.out.println("B 학점 입니다.");			
			break;
		case 7:
			System.out.println("C 학점 입니다.");			
			break;
		case 6:
			System.out.println("D 학점 입니다.");			
			break;

		default:
			System.out.println("재수강이나 해랏");
			break;
		}
		
		
	}

}
