package day2;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력하셈.");
		
		int num = s.nextInt();
		
		if(num%3==0 || num%2==0) {
			System.out.println("조건을 만족합니다.");
		}
		else {
			System.out.println("조건 만족 안함.");
		}
		System.out.println("판독기를 종료합니다.");
		

	}

}
