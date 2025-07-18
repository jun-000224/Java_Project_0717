package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random1 {

	public static void main(String[] args) {
		//랜덤한 구구단 문제를 출제
		//맞췄을 때 점수를 준다거나, 맞춘 개수를 판다하거나
		//Math, Random 둘 중 하나로 랜덤한 숫자를 가져오는게 가능하다. 
		Random ran = new Random();
		
//		int x = ran.nextInt(10); //범위는 0부터 9까지임
//		int y = ran.enxtInt(10) + 1; //1~10
//		System.out.println(x);
		
		int x = ran.nextInt(8)+2; //2~9
		int y = ran.nextInt(9)+1; //1~9
		System.out.println("랜덤 구구단 문제 풀이");
		System.out.println(x + "*" + y + " = ");
		
		//정답을 입력받고 정답이면 정답 오답이면 오답
		Scanner s = new Scanner(System.in);
		System.out.println("정답 뭐임?");
		
		int answer = s.nextInt();
		
		if(answer == (x*y)) {
			System.out.println("정답입니다.");
		}else{
			System.out.println("오답입니다.");
		}
		
	}

}
