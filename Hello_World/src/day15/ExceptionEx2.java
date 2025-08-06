package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		while(true)
			try {
				System.out.print("숫자 입력 1 >> ");
				int num1 = s.nextInt();
				System.out.print("숫자 입력 2 >> ");
				int num2 = s.nextInt();
				System.out.println(num1/num2);	
				break;
				
				
			} catch (Exception e) {   //Exception e는 모든 에러를 찾아줌.
				System.out.println(e.getMessage());		//뭐때문에 발생한 에러인지 간단히 알려줌
				System.out.println("에러가 발생했음.");
				s.nextLine();
				
			}
	}

}
