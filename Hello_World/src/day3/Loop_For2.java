package day3;

import java.util.Scanner;

public class Loop_For2 {

	public static void main(String[] args) {
		//중첩 for문에 대하여
//		Scanner s = new Scanner(System.in);
//		System.out.println("몇 단을 하고 싶니? :");
//		
//		int num = s.nextInt();
		
		for(int i=2; i<=9; i++) {
			System.out.println("== " + i + "단 ==");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}

}
