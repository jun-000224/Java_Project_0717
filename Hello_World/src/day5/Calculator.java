package day5;

public class Calculator {
	
	void intro() {
		System.out.println("계산기 입니다!");
	}
	
	int returnNumber() {
		return 10;
	}
	
	int sum(int x, int y) {
		return x + y;
	}
	
	int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	int min(int x, int y) {
		return x>y ? y : x;
	}
	
	int arrSum(int[] arr123) {
		//배열을 파라미터로 받아서 모든 값을 더한 후 리턴하는 메소드
		int sum = 0;
		for(int i=0; i<arr123.length; i++) {
			sum += arr123[i];
		}
		return sum;
	}
	
	void intro2(String name, int age, double height) {
		System.out.println(name+"의 나이는 " + age +", 키는 "+ height +" 입니다.");
	}
}
