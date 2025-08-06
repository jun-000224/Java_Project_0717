package day15;

import java.util.Random;
import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int count = 0; //문제 수
		int score = 0; //맞춘 수
		
		System.out.println("구구단 게임에 오신 여러분 진심으로 환영합니다.");
		
		while(true) {
			count++;
			int dan = ran.nextInt(8)+2; //2단부터 9단까지
			int dan2 = ran.nextInt(9)+1;
			System.out.print(dan + "*" + dan2 + "=" + "?");
			int answer = s.nextInt();
			if(answer == dan*dan2) {
				System.out.println("정답입니다!");
				score++;
			}else {
				System.err.print("땡!");
			}
			
			if(count==5 && score>=3) {
				System.out.println("생존!");
				break;
			}else if(count==5 && score<3){
			System.err.println("재시작!");	
				count = 0;
			}
		}
	}

}
