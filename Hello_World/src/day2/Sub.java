package day2;

import java.util.Scanner;

public class Sub{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = s.nextInt();
		
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum +=i;
			}
		System.out.println(sum);
		}
	}
