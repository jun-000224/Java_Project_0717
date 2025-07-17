package day2;
import java.util.Scanner;

public class If_1 {
//
//	public static void main(String[] args) {
//		//조건문(if)
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("본인의 나이를 입력하시오.");
//		
//		int a = scanner.nextInt();
//		
//		if(a>=20) {
//			System.out.println("성인입니다.");
//		}
//		else {
//			System.out.println("미성년자입니다.");
//		}
//		System.out.println("종료합니다.");
//	}
//	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("본인의 점수를 입력하세요");
		
		int score = scanner.nextInt();
		
		if(score>=90) {
			System.out.println("A학점");
		}else if(score>=80) {
			System.out.println("B학점");
		}else if(score>=70) {
			System.out.println("C학점");
		}else {
			System.out.println("재수강하세요.");	
		}
		System.out.println("학점 판독기 종료");
	}

}
