package day4;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("본인의 학점을 입력하세요 : ");
		double finish = s.nextDouble();
		
		System.out.print("원하는 학점을 입력하세요 : ");
		double want = s.nextDouble();
		
		System.out.print("지금까지 이수한 학점을 입력하세요 : ");
		double time = s.nextDouble();
		
		double total = finish*120-31.8; //현재 총점
		double best = 4.5*3; //3학점으로 가정하고 최고 점수 시나리오

		
		
		
		for(int i=1; i<10000000; i++) {
			
			total = total+best;
			time +=3.0;
			finish = total/time;
			
//			System.out.println(finish+ "로 변경되었습니다.");
			if(finish > want ) {
				System.err.println(i*3 + "학점 더 들어야 합니다.");
				break;
			}
		}
		
	}

}
