package day2;

public class FinalVar {

	public static void main(String[] args) {
		//상수 - 값의 변경이 불가능한 변수
		int num1 =10;
		num1 = 20;
		
		//pi = 3.14, 3.141592, 3.1415926538979.....
		final double PI = 3.141592;
		//PI = 3.14 //상수이기 때문에 수정이 불가능해짐
		
		int num3 =5;
		int num4 = 10;
		System.out.println(num3 >3); //true
		System.out.println(num4 > num4); //false
		System.out.println(num3 <= 5); // true
		System.out.println(num4 == 10); // true
		System.out.println(num3 != 8); // true
		
		System.out.println(num3 > 5 || num4 > 8); //true
		System.out.println(num3 > 3 || num4 > num3); //true
		System.out.println(num3 > 3 || num4 > num3); // true
	}

}
