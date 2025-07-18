package day3;

public class Day2_Review {

	public static void main(String[] args) {
		//연산자
		int num1 = 10;
		
		//num1에 3을 더해서 다시 저장해라
		num1 += 3;
		
		int num2 = 5;
		int num3 = 10;
		
		//비교 연산자
		System.out.println(num2 > num3); //false
		System.out.println(num2 < num3); // true
		System.out.println(num2 > 5); //true
		System.out.println(num3 <= 10); // true
		System.out.println(num2 = num3); // num2의 갱신된 값 출력
		System.out.println(num2 == num3);
		System.out.println(num2 != num3);
		System.out.println(num2=5);
		
		//and, or, (xor)
		//or -> 둘 중 하나라도 참이면 참 ||
		//and -> 둘 다 참이어야 참 &&
		System.out.println(num2>num3 || num2 > 3); //true
		System.out.println(num2>num3 && num2 > 3); //false
		
		
		
		
		
	
		
		
	}

}
