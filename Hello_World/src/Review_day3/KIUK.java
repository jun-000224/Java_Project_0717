package Review_day3;

import java.util.Scanner;

public class KIUK {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("나메린에게 보낼 ㅋ의 수를 입력하시오 : ");
		int input = s.nextInt();
		
		while(true)
		if(input <=4) {
				System.err.println("아니 근데 오빠 4개 이하 쓰지 말랬지. 다시");
			}
			else {
				for(int i = 1; i<=input; i++) {
					System.out.print("ㅋ");
				}
		}
	}

}
