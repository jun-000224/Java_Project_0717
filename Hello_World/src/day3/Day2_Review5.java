package day3;

import java.util.Scanner;

public class Day2_Review5 {

	public static void main(String[] args) {
		//1. 숫자를 하나 입력 받아서 홀수면 홀수, 짝수면 짝수 출력
		//2. 숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		//3. 가장 큰 수만 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		int num = s.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
		
//		System.out.print("첫 번째 숫자를 입력하세요 : ");
//		int num1 = s.nextInt();
//		System.out.print("두 번째 숫자를 입력하세요 : ");
//		int num2 = s.nextInt();
//		System.out.print("세 번째 숫자를 입력하세요 : ");
//		int num3 = s.nextInt();
//		System.out.print("네 번째 숫자를 입력하세요 : ");
//		int num4 = s.nextInt();
//		System.out.print("다섯 번째숫자를 입력하세요 : ");
//		int num5 = s.nextInt();
//		
//		System.out.println("합은 " + (num1 + num2 + num3 + num4 + num5));
		
		
//		System.out.print("첫 번째 숫자를 입력하세요 : ");
//		int num6 = s.nextInt();
//		System.out.print("두 번째 숫자를 입력하세요 : ");
//		int num7 = s.nextInt();
//		System.out.print("세 번째 숫자를 입력하세요 : ");
//		int num8 = s.nextInt();
//		System.out.print("네 번째 숫자를 입력하세요 : ");
//		int num9 = s.nextInt();
//		System.out.print("다섯 번째 숫자를 입력하세요 : ");
//		int num10 = s.nextInt();
//		
//		int best = num6;
//		
//		if(best<num7) {
//			best = num7;
//		}
//		if(best<num8) {
//			best = num8;
//		}
//		if(best<num9) {
//			best = num9;
//		}
//		if(best<num10) {
//			best = num10;
//		}
//		
//		System.out.println("가장 큰 수는 " + best);
		
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int number = s.nextInt();	
			sum += number;
		}
		System.out.println(sum);
		
		int Big = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : " );
			int number = s.nextInt();
			if(Big < number) {
				Big = number;
			}
		}
		System.out.println(Big);
		
		
	}

}
