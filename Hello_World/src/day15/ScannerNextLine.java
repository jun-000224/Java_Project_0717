package day15;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
			System.out.print("숫자 입력 1 >> ");
			int num1 = s.nextInt(); //  입력값 \n으로 버퍼에 저장됨 -> 엔터를 쳤기 때문임

			System.out.print("문자 입력 >> ");
			String str = s.next();  // 10\nabc\n 이런식으로 저장됨.
						//enxtLine()을 쓰면 앤터기록까지 있어서 스킵되고 넘어갈꺼임.
			System.out.print("숫자 입력 2 >> "); 
			int num2 = s.nextInt();
			

	}

}
