package day2;

import java.util.Scanner;

public class Loop_For3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력하시오.");
		
		int num = scanner.nextInt();
		int sum = 0;
		
		for (int i=1; i<=num; i++) {
			if(i%2==1) {
				sum += i;			
			}
		}
		System.out.println(sum);
	}

}
