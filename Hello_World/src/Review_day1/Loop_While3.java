package Review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_While3 {
	
	static int ququCount = 0;
	static int correct = 0;
	//구구단 메소드
	public static int randomgugudan() {
		
		int count = 0;
        Random ran = new Random();
        Scanner s = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
        	
            int a = ran.nextInt(9) + 1; // 1~9
            int b = ran.nextInt(9) + 1;
            
            ququCount ++;
            
            System.out.print(i + ") " + a + " x " + b + " = ");
            int answer = s.nextInt();
            if (answer == a * b) {
                System.out.println("정답입니다!");
                correct ++;
                count ++;
            } else {
                System.out.println("오답입니다! 정답은 " + (a * b));
            }
        }
        int arr[] = {count, 3-count}; 
        return arr;
	}
	
	
	//업다운 게임 메소드 
	public static void gameUpAndDown() {
		
        Random ran = new Random();
        Scanner s = new Scanner(System.in);
        int count = 0;
        
        int target = ran.nextInt(30) + 1; // 1~100
        System.out.println("1부터 30 사이 숫자를 맞혀보세요!");

        while (true) {
            System.out.print("숫자 입력: ");
            int guess = s.nextInt();
            
            count++;
            
            if (guess == target) {
                System.out.println("정답입니다!");
                break;
            } else if (guess < target) {
                System.out.println("UP!");
            } else {
                System.out.println("DOWN!");
            }
        }
        System.out.println(count+"번 만에 맞추셨습니다.");		
	}

	//성적 조회 메소드
	public static void gugudanScore() {
		System.out.println(ququCount  + "중에서 " + correct + "개 맞추셨습니다.");
	}
	
	
	
	//메인 함수
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("====== 메뉴를 선택해주세요 =======");
            System.out.println(" [ (1)랜덤 구구단  (2)Up&Down  (3)구구단 성적 조회 (*)그 외에는 종료 ] ");

            int input = s.nextInt();

            if (input == 1) {
                randomgugudan();

                
            } else if (input == 2) {
                gameUpAndDown();
                
            } else if (input ==3) {
            	gugudanScore();
                
                
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println(); // 한 줄 띄우기
        }

        s.close();
    }
}
