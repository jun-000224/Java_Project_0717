package day2;

public class Day1_Review2 {

	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		System.out.println(a);
		
		//연산자(1. 사칙연산)
		//숫자 + 숫자 => 숫자
		//문자 + 숫자 => 문자(문자가 1개라도 있으면 문자)
		
		String name = "홍길동";
		int age = 30;
		System.out.println(name+age);
		System.out.println(age + 5);
		System.out.println(name + age + 5);
		System.out.println(name+age);
		System.out.println(name + (age+5));
		System.out.println(age+"5");
		
		
		//정수와 정수의 계산 결과는 정수
		//실수와 정수의 계산 결과는 실수
		//즉, 소수점이 있는 숫자는 하나라도 있으면 소수 포함
		int num1 = 10;
		int num2 = 4;
		System.out.println(num1/num2);
		System.out.println((double)num1/num2);
		System.out.println((float)num1/num2);
		double num3 = 4.0;
		System.out.println(num1/num3);
		
		int num4 = 10;
		//%는 나머지 연산(나머지 값을 리턴)
		System.out.println(num4 % 2);
		System.out.println(num4 % 3);
		System.out.println(num4 % 4);
		
		for (int i=1; i<=100; i++) {
			if(i%3 ==0 ) {
				System.out.println(i+"는 3의 배수입니다");
			}
		}
	}

}
