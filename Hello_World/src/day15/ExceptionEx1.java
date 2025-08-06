package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		try {
			System.out.print("숫자 입력 1 >> ");
			int num1 = s.nextInt();
			System.out.print("숫자 입력 2 >> ");
			int num2 = s.nextInt();
			System.out.println(num1/num2);	
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (InputMismatchException e) {
			System.out.println("값을 제대로 입력하세요.");
			s.nextLine();

		}
	}

}
