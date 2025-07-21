package day4;

public class Loop_Dowhile {

	public static void main(String[] args) {
		//while, do~while차이
		//while은 조건을 만족하지 않으면 한번도 실행 안할 수 있다.
		//do~while은 조건과 상관없이 무조건 한 번은 실행하고 조건 비교를 한다.
		
		int i=10;
		while(i<5) {
			System.out.println("while 실행!");
		}	
		
		do {
			System.out.println("do~while 실행!");
		} while(i<5);
		
		}
	}


