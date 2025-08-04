package Review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_While3 {
	
	static Random ran = new Random();
	static Scanner s = new Scanner(System.in);
	
	public static int[] randomGuGuDan(int num) {
		int count = 0;
		System.out.println(num + "문제 풀이를 시작합니다.");
		for(int i=1; i<=num; i++) {
			int x = ran.nextInt(8) + 2; // 2~9
			int y = ran.nextInt(9) + 1; // 1~9
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			if(answer == (x*y)) {
				System.out.println("정답입니다!");
				count++;
			} else {
				System.out.println("오답입니다. 정답은 " + (x*y) + "입니다.");
			}
		}
		int arr[] = {count, num-count, num}; // 첫번째 값은 정답 개수, 두번째 값은 오답 개수 
		return arr;
	}
	
	public static void gameUpAndDown() {
		// 1부터 30 사이의 랜덤한 숫자 생성 후
		// 값을 입력받아서 몇번만에 맞추는지 출력해준 후 종료
		// 랜덤숫자가 입력값보다 더 클 경우 => 'UP'
		// 작을 경우 => 'DOWN' 출력
		// 정답을 맞추면 'OO번만에 맞추셨습니다.' 출력 
		int ranNum = ran.nextInt(30) + 1; // 1~30
		System.out.println("Up&Down 게임 시작!");
		int count = 0;
		for(;;) {
			System.out.print((count+1) + "번째 정답 입력 : ");
			int answer = s.nextInt();
			count++;
			if(ranNum == answer) {
				System.out.println(count + "번만에 맞추셨습니다.");
				break;
			} else if(ranNum > answer) {
				System.out.println("Up");
			} else {
				System.out.println("Down");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 메뉴
		// 1을 선택하면 랜덤 구구단 문제 3문제 풀이
		// 2를 선택하면 up&down 게임
		// 1~2외의 값을 선택하면 종료
		int correctCount = 0; // 정답 개수
		int inCorrectCount = 0; // 오답 개수
		int count = 0; // 전체 문제 수
		while(true) {
			System.out.println("=== 메뉴를 선택해주세요. ===");
			System.out.print("[ (1)랜덤 구구단 (2)Up&Down (3)구구단 성적조회 (그외)종료 ] : ");
			
			int menu = s.nextInt();
			if(menu == 1) {
				System.out.print("풀이하고자 하는 문제 수를 입력해주세요 : ");
				int num = s.nextInt(); 
				int arr[] = randomGuGuDan(num); // 랜덤 구구단
				
				correctCount += arr[0];
				inCorrectCount += arr[1];
				count += arr[2];
			} else if(menu == 2) {
				// Up&Down
				gameUpAndDown();
			} else if(menu == 3){
				System.out.println(count + "문제 중 " + correctCount + "개 맞추셨습니다.");
			} else {
				// 종료
				break;
			}
			
		}
	}
}