package day1;

public class First {

	public static void main(String[] args) {
		 //문자표현 -> String
		 //숫자(정수-소수x) => int, 단 21억이 넘는 숫자는 long
		 //숫자(실수-소수점0) -> double
		 //참 or 거짓 -> boolean
		 //첫 글자가 대문자면 클래스이다. 
		 //메소드는 괄호가 붙는다.
		 //패키지->윈도우 관점 폴더(day1같은거) 누르고 f2는 rename 가능
		 //드래그하고 ctrl + /하면 주석처리 가능
		 //ctrl + d 하면 커서 있는 행 전부 삭제
		 //var 키워드는 호환성 문제로 성능은 좋으나 사용하지 않는걸로. 
		
		String name = "이동준";
		int age = 26;
		double height = 170.5;
	    boolean married = false;		
		System.out.println("나이:" + age);
	    System.out.println("나이:" + (age+5));
	    
	    //위에서 선언한 변수를 이용해서 
	    //홍길동의 나이는 30, 키는 170.5입니다.
	    System.out.println(name + "의 나이는" + age + ", 키는" + height + " 입니다.");
	    
	    
	    int age2;
	    age2 = 35;
	    System.out.println(age2);
	
	}

}
