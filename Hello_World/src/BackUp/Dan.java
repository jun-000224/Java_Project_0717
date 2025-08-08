package BackUp;

import java.util.Random;
import java.util.Scanner;

public class Dan {

	public static void main(String[] args) {
//		 구구단 문제를 랜덤으로 생성하여 출력하고 사용자로부터 답을 입력 받으시오.
//		 조건 1. 기본적으로 랜덤 문제를 5번 제공한다.
//		 조건 2. 5문제 중 3문제 이상 정답을 맞췄을 경우 종료한다.
//		 조건 3. 5문제 중 3문제 이상 틀렸을 경우 위 과정을 다시 반복 한다.
//		 조건 4. print문으로 출력하는 문구는 자유롭게 정의한다.
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int count = 0;
		int score = 0;
		
		System.out.println("구구단 게임 시작!");
		
		while(true) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			
			count++;
			System.out.print(x + "*" + y + " >> ");
			int answer = s.nextInt();
			
			if(answer == x*y) {
				System.out.println("정답입니다.");
				score ++;
			}
			else {
				System.err.println("오답입니다.");
			}
			
			if(count==5 && score>= 3) {
				System.out.println("통과!");
				break;
			}else if(count==5 && score<3) {
				System.err.println("실패! 처음부터 구구단 게임을 다시 시작합니다!");
				count=0;
			}
		}
	}

}
