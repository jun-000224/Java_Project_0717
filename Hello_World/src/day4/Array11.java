package day4;

public class Array11 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,-15,10,-8};
		//배열에 있는 값들을 절대 값(음수=>양수)를 기준으로 가장 큰 수 찾기, 정답 15
		int max = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]= Math.abs(arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println(max);
	}

}
