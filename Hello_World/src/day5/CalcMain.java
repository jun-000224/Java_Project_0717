package day5;

import java.util.Arrays;

public class CalcMain {

	public static void main(String[] args) {
		//calculator 클래스를 이용해서 calc라는 객체를 생성
		Calculator calc = new Calculator();
		calc.intro();
		int num1 = calc.returnNumber();
		
		int num2 = calc.sum(10,5);
		System.out.println(num2);
		
		int max = calc.max(5, 8);
		//더 큰 숫자를 반환하는 
		System.out.println(max);
		
		int min = calc.min(2, 222);
		System.out.println(min);
		
		int arr[] = {3,5,1,4,2};
		int arrSum = calc.arrSum(arr);
		System.out.println(arrSum);
		
		calc.intro2("이먕먕", 5, 6);
		
		
}	}