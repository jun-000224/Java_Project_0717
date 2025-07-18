package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random3 {

	public static void main(String[] args) {
		//문제수 입력받음
		//정답에 0을 입력하면 종료되게
		//종료시점에 푼 문제 개수, 정답 몇 개인지까지
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
	
		int count = 0;
		
		System.out.print("원하는 문제수는? :");
		int num = s.nextInt();
		System.out.println(num + "문제 풀이를 시작함. 0입력시 종료");
		
		for(int i =1; i <=num; i++) {
			int x = ran.nextInt(8)+2; //2~9
			int y = ran.nextInt(9)+1; //1~9
			System.out.print(i + "번 : " + x + "*" + y + "=");
			int answer = s.nextInt();
			if (answer == (x*y)) {
				System.out.println("정답입니다.");
				count++;
			}else if (answer==0){
				System.out.println("문제풀이를 종료합니다.");
				num = i-1;
				break;
			}else {
				System.out.println("오답입니다.");
	
			}
		}
		System.err.println(num + "개 중에서"  + count + "개 맞추셨습니다.");
	
	}

}
