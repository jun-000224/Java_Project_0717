package day2;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 단 할지 입력하시오.");
		
		int num = scanner.nextInt();
		
		int cul = 0;
		//역순으로 구구단 출력
		
		for(int i = 9; i>=1; i--) {
			cul = (num*i);
			System.out.println(num + "*" + i + "="+ cul);
		}
	}

}
