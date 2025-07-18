package day3;

public class Loop_For4 {

	public static void main(String[] args) {
		for(int i=9; i>=2; i--) {
			System.out.println("== "+ i+ "단 ==");
			for(int j=9; j>=1; j--) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}

}
