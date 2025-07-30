package Review_day2;

public class MethodMain {

	public static void main(String[] args) {
		
		String aaa =  MethodEx.testA();
		System.out.println(aaa);
		
		MethodEx.testB(); //리턴이 없는 메소드이므로 변수에 저장 불가
		
		int a= 10; 
		MethodEx.testC(a);
	
		System.out.println(MethodEx.testC(a));
		
		
		double c = MethodEx.testD(a, 1.5); // 두 개 곱한 값 리턴
			System.out.println(c);
			
		int[] testArr = {1,2,3,4,5};
		MethodEx.testE(testArr);
	}

}
