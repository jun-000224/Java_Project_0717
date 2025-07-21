package day4;

public class Array8 {

	public static void main(String[] args) {
		//{2,4,5,3,1}이라는 배열이 주어졌을때 배열의 숫자에 맞게 각 줄에 출력
		
		int array[] = {2,4,5,3,1};
		
		for(int i = 0; i<=(array.length-1); i++) {
			for(int j=1; j<=array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
