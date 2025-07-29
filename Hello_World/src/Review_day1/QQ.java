package Review_day1;

public class QQ {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		int count = 0;
		
		for(int i = 5; i>=1; i--) {
			count ++;
			for(int j = 1; j <= count; j ++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
		
		
		
	}

}
