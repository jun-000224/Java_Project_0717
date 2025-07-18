package day3;

import java.util.Random;
import java.util.Scanner;

public class Up_and_Down {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("업다운리 시작~");
		int random = ran.nextInt(100)+1;
		
		int up = 0;
		int down = 0; //저장 변수
		int count = 0;
		
		while(true) {
			System.out.println("숫자 하나 골라봐라잉");
			int answer = s.nextInt();
			
			if(answer>=1 && answer<=100) {
				count ++;
			}else {
				System.err.println("똑바로 해라잉");
				continue;	
				
			if(up<=answer || down>=answer) {
				System.out.println("다시 제대로 하세요.");
				continue;
				
			}else {			
				if(random>answer) {
					System.out.println("Up");
					up=answer;
				}else if(random < answer) {
					System.out.println("down");
					down = answer;
				}else {
					System.out.println("정답입니다.");
					break;
				}
			}
			System.out.println(count + "번 만에 맞추셨습니다.");
		}
		}

	}
    
