package day6;

import java.util.Scanner;

public class ReviewMain2 {

	public static void main(String[] args) {
		
		//오버로딩은 호출할 때 데이터 타입이나 개수로 구분
		Calc_Review calc = new Calc_Review();
		int a = calc.sum(10, 5);
		double b = calc.sum(10.6, 3);
		double c = calc.sum(5.8, 9.2);
		int d = calc.sum(3, 5, 12);
		
		Scanner s = new Scanner (System.in);
		String subject = "자바";
		
		System.out.print("현재 우리가 배우는 과목명은 : ");
		String answer = s.next();
		//String이 대문자니까 호출된 asnwer는 객체라는 관점으로 봐야함.
		//따라서 answer은 해당 객체의 주소값이 되므로 단순 문자열과 비교가 불가함.
		if(subject.equals(answer)) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}

}
