package day14;

public class DebugEX1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		a = a+b;
		b++;
		int c = a*b;
		
		a %=2;
		if(a>5) {
			System.out.println("실행!" + a);
		}
		for(int i=1 ; i<10; i++) {
			System.out.println(i);
		}
		
		
	}
	

}
