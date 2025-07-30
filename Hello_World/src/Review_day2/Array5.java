package Review_day2;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		 
        // 공간은 10개, 숫자범위는 1~30
        int arr[] = ArrayFunc.randomArr(10, 1, 30);
        System.out.println("원본 배열: " + Arrays.toString(arr));

        int oddCount = 0;
        int evenCount = 0;

        // 홀수, 짝수 개수 세기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        
        // odd를 넣으면 홀수 개수를, even을 넣으면 짝수 개수를 리턴
        int oddSize = ArrayFunc.arrLength(arr, "odd"); // 홀수 개수
        int evenSize = ArrayFunc.arrLength(arr, "even"); // 짝수 개수

        int[] oddArr = ArrayFunc.arrLength(arr, "odd", oddSize);  // 홀수 배열
        int[] evenArr = ArrayFunc.arrLength(arr, "even", evenSize);  // 짝수 배열
        
        
        
       System.out.println(); 
        
        
        
      
	}

}
