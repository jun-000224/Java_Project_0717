package day3;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("별이 몇 개?");
		
		int num = s.nextInt();
		
		if(num==5) {
			System.out.println("장수돌침대~");
			System.out.println();
		}
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


