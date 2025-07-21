package day4;

import java.util.Random;
import java.util.Scanner;

public class Day3_Review2 {

	public static void main(String[] args) {
		//1부터 10사이의 랜덤한 숫자 생성
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int num = ran.nextInt(100)+1;
		int count = 0;
		//for(;;) -> while(true)랑 동일함 
		
		for(;;) {
			System.out.print("숫자 입력 : ");
			int input = s.nextInt();
			
			count++;
			
			if(num>input) {
				System.out.println("Up");	
			}
			else if(input>num) {
				System.out.println("Down");
			}else {
				break;
			}
		}
		System.out.println(count + "번 만에 맞추셨습니다.");
	}

}
