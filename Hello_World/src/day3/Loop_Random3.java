package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random3 {

	public static void main(String[] args) {
		
		//문제수 입력받음
		//정답에 0을 입력하면 종료되게
		//종료시점에 푼 문제 개수, 정답 몇 개인지까지
		//5문제를 맞춘 시점에 종료시켜주기
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
//		System.out.print("원하는 문제수는? :");
//		int num = s.nextInt();
		
		int count =0;
		
		while(true) {

			int x = ran.nextInt(8)+2; //2~9
			int y = ran.nextInt(9)+1; //1~9
			System.out.print(x + "*" + y + "= ?");
					
			int answer = s.nextInt();
				
			if (answer == (x*y)) {
				System.out.println("정답입니다.");
				count++;
					
			}else {
				System.out.println("오답입니다.");
			}
			if(count==5) {
				break;
			}
		}
		System.err.println("5개 맞추셨습니다. 짝짝짝~");
	}
}


	
		


