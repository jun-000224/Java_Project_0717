package day1;

public class Operator1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		//ctrl + alt + 화살표 아래는 아래로 복사
		//정수(소수점이 없는 수)와 정수의 계산은 무조건 결과가 정수
		
		//수를 계산할 때 하나라도 실수(소수점 포함)가 있따면 결과가 무조건 실수로
		int num3=10;
		double num4 = 3; //3.0으로 저장됨, 더블이기 때문
		System.out.println(num3/num4);
		
		System.out.println((double)num1/num2);
		//(double)로 형변환
		
		
		if(num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		
		
		
		
		
		
		
	}

}
