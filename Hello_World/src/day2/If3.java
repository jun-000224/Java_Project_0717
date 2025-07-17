package day2;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("본인 몇 살임?");
		
		int age = s.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미자입니다.");
		}
		System.out.println("판독기 종료합니다.");
	
		
	}

}
