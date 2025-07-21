package day3;

import java.util.Random;
import java.util.Scanner;

public class Up_and_Down {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("업다운 게임 시작");
		int random = ran.nextInt(100) + 1;
		
		int up = 0;
		int down = 100;
		int count = 0;
		
		while (true) {
			System.out.println("숫자 하나를 고르시오 : ");
			int answer = s.nextInt();

			if (answer >= 1 && answer <= 100) {
				count++;
				
				if (answer <= up || answer >= down) {
					System.out.println("범위 내에서 다시 입력하세요. 현재 범위: " + (up + 1) + " ~ " + (down - 1));
					continue;
				}

				if (random > answer) {
					System.out.println("Up");
					up = answer;
				} else if (random < answer) {
					System.out.println("Down");
					down = answer;
				} else {
					System.out.println("정답입니다.");
					break;
				}
			} else {
				System.err.println("1~100 사이의 수를 입력하세요.");
				continue;
			}
		}
		
		System.out.println(count + "번 만에 맞추셨습니다.");
	}
}
