package day4;

public class Array1 {

	public static void main(String[] args) {
		//배열
//		int arr[] = new int[5]; //저장공간 5개짜리 배열 생성
//		arr[0]=10; //인덱스 값마다 값을 할당시켜줘야함.
//		arr[3]=3;
//		//인덱스 선언시 초기값은0, double같은 경우 0.0으로 초기값을 가짐.
//		
//		arr[1] = 5;
//		
//		System.out.println(arr[1]);
//		arr[4]=10;
//		System.out.println(arr[4]);
		
//		//배열 선언과 동시에 초기화 가능
		int arr[] = {1,3,5,7,2};
//		System.out.println(arr[2]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.err.println(arr.length);
		
		
		
	}

}
