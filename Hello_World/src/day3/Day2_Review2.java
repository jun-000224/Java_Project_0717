package day3;

import java.util.Scanner;

public class Day2_Review2 {

	public static void main(String[] args) {
		//조건문
		//단순 if, if ~ else, if ~ else if ~ else, 중첩 if
		
//		if(num1 > 20) {
//			System.out.println("20보다 큽니다.");
//		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		int num1 = s.nextInt();
		
		if(num1>20) {
			System.out.println("20보다 큽니다.");
		}else {
			System.out.println("20이하의 숫자입니다.");
		}
		
		
		
		
	}

}
