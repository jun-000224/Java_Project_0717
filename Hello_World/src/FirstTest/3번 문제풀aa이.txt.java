package FirstTest;

import java.util.Random;
import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int score = 0;
		int nope = 0;
		
		while(true) {
			
			System.out.print("당신은 몇 문제를 풀고 싶습니까 >> ");
			int want = s.nextInt();
			
			if(want< 3 || want>10) {
				System.err.println("문제 수는 최소 3문제, 최대 10문제 입니다.");
			}else {
				for(int i=1; i<=want; i++) {
					int x = ran.nextInt(8)+2; 
					int y = ran.nextInt(9)+1;
					
					System.out.print(x + "*" + y + "= ?");

					int answer = s.nextInt();
					if(answer == x*y) {
						System.out.println("정답입니다!");
						score ++;
					}else {
						System.err.println("오답입니다 !");
						nope ++;
				}
			}
				
		    if(score>nope) {
		    	System.out.println("통과입니다");
		    	break;
		    }else {
		    	System.out.println("재도전 하시겠습니까?");
		    	String contiue = s.next();
		    	if(contiue.equals("네")) {
		    	}else {
		    		System.out.println("게임을 종료합니다.");
		    		break;
		    	}
		    }
		}
	}
	}
}
