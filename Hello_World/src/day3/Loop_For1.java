package day3;

import java.util.Scanner;

public class Loop_For1 {
	
	//5번 입력받아서 해당 숫자들의 합 출력, 음수는 다시 입력, 0을 입력하면 더 이상 입력x-> 종료

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int number = s.nextInt();	
			if(number <0) {
				System.out.println("불가능. 다시.");
				i--;
				continue; //continue에 닿으면 내려가지 않고 다시 반복 실행
			}else if(number ==0) {
				System.out.println("0을 입력하셨으므로, 진행 종료.");
				break;
			}
			sum += number;
		}
		System.out.println(sum);
	}

}
