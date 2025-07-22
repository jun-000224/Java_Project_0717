package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
//		아래 이미지를 참고하여 같은 결과가 나오도록 하시오.
//		 * 기본 절차 설명
//		  - 최초에는 메뉴 선택 텍스트 출력
//		  - 1을 입력할 경우 문제 풀이로 이동. 랜덤 구구단 문제 출제
//		  - 문제를 맞추거나 틀림에 따라 상황에 맞는 텍스트 출력
//		  - 정답에 0을 입력할 경우 메뉴 선택으로 이동
//		  - 2를 누를경우 그동안 풀이 했던 문제의 정답 및 오답 개수 출력 후 메뉴 선택으로 이동
//		  - 1~3외의 값을 입력할 경우 '1~3중 선택해 주세요' 텍스트 출력 후 메뉴 선택으로 이동
//		  - 3을 누르면 '종료되었습니다' 출력 후 종료
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int count = 0;
		int score = 0;
		
		while(true) {
			System.out.println("===== 메뉴 선택 ======");
			System.out.println("(1)문제풀이 (2)현재 스코어 (3) 종료");
			int select = s.nextInt();
			
			switch (select) {
				case 1:
					System.err.print("랜덤 구구단을 시작합니다.");
					while(true) {
						int random1 = ran.nextInt(8)+2;
						int random2 = ran.nextInt(8)+2;
						
						System.out.print(random1 + " * " + random2 + " = " );
						
						int answer = s.nextInt(); 
						
						if(answer == random1*random2) {
							System.out.println("정답입니다!");
							count++;
							score++;
						}else if(answer ==0) {
							break;
						}else {
							System.err.println("오답입니다. 정답은 " + (random1*random2) + " 입니다.");
							count++;
						}
					}
					break;
	
				case 2:
					System.out.println("지금까지 푼 문제 : " + count + ", 정답 개수 : " + score);
					break;
					
				case 3:
					System.err.println("종료되었습니다.");
					break;

		}
	}
}
}
