package day1;

public class Var2 {

	public static void main(String[] args) {
		int number = 10;
		System.out.println((double) number);
		
		double number2 = 10.5;
		System.out.println((int) number2);
		//오류는 발생하지 않지만 사용에 주의해야함.
		//강제로 소수가 버려지기 때문(손실발생) -> 의도하지 않았다면 문제가 될 수 있음.
		//즉, 더 작은 개념(int)에서 더 큰 개념(double)로 바꾸는거는 문제 없음
		//반대로 double을 int로 바꾸면 문제가 될 수 있음.(소수점 자리 데이터 소실)
		
	}
}
