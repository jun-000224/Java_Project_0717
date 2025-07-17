package day2;

import java.util.Scanner;

public class Loop_for2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = s.nextInt();
		
		long sum=0;
		for(int i=1; i<=2100000000; i++) {
			sum +=i;
			if(i==num) {
				System.out.println(sum);
			}
		}
	}
}
