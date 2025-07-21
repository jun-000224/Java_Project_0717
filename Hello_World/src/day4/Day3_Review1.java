package day4;

import java.util.Scanner;

public class Day3_Review1 {

	public static void main(String[] args) {
		
		int count = 0;
		
		while(true) {
		//5개의 양수를 입력받고, 0이하의 숫자를 입력할 경우 다시 입력하도록 유도하시오.
		//0이하의 숫자를 입력하도록 유도
			
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. 양수 5개");
		
		int num = s.nextInt();
			if(num<=0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			else {
				count++;
			}
			
		if(count==5) {
			System.out.println("입력이 완료되었습니다.");
			break;
		}
		
		}
		
	}

}
