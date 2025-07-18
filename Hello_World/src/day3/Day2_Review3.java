package day3;

import java.util.Scanner;

public class Day2_Review3 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		
		int num1 = s.nextInt();
		
		//if ~else if 
		//90점 이상이면 'A학점'
		//80점 이상이면 'B학점'
		//70점 이상이면 'C학점;
		//60점 미만이면 'F학점';
		
		if(num1 >= 0 && num1 <= 100 ) {
			if(num1 >= 90) {
				System.out.println("A학점");
			}else if(num1>=80) {
				System.out.println("B학점");
			}else if(num1>=70) {
				System.out.println("C학점");
			}else if(num1>=60) {
				System.out.println("D학점");	
			}else {
				System.out.println("F학점");
			}
		}else {
			System.out.println("잘못된 값입니다.");
		}

	}
}
