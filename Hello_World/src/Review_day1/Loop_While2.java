package Review_day1;

import java.util.Random;
import java.util.Scanner;

public class Loop_While2 {

	public static void main(String[] args) {
		
		//랜덤한 숫자 화면에 출력
		
		Random ran = new Random();
		
		int count = 0;
		
		while(true) {
			int ranNum = ran.nextInt(1000000000)+1; 
			count++;
			if(ranNum == 50) {
				System.out.println("50출력 후 종료");
				break;
			}
			System.out.println(ranNum);
			
			}
		System.out.println(count + "회 출력 후 찾았습니다.");
		}
	}



	
