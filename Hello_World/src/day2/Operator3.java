package day2;

public class Operator3 {

	public static void main(String[] args) {
		//not, or, and
		//or(||) : 둘 중 하나라도 만족하면  true 
		// | 이거는 shift + 역슬래쉬
		//and(&&) : 둘 다 만족해야 true
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(true && false);
		
		int num1 = 5;
		int num2 = 10;
		System.out.println(num1 > 8);
		System.out.println(num1 > 8 || num2 >8);
		System.out.println(num1 > 8 && num2 >8);
		
	}

}
