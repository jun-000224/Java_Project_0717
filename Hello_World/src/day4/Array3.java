package day4;

public class Array3 {

	public static void main(String[] args) {
		int arr[] = {1,5,10,25,3}; // int[] arr해도 됨. 선언 방식 차이
		
		//arr배열에서 가장 큰 값 찾기
		
		int max = 0;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				count = i;
			}			
		}
		System.out.println(count + "번 째의 수가 " + max + "로 가장 큽니다.");
		
		
	}

}
