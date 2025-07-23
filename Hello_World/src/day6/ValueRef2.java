package day6;

import java.util.Arrays;

public class ValueRef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = a;
		b = b + 3;
		System.out.println(a);
		
		int arr[] = {1,2,3,4,5}; // 주소가 I@2d127a61
		int copyArr[] = arr; //카피배열 주소도 I@2d127a61
		copyArr[2] = 10000; //해당 주소(둘 다 해당)의 3번째 인덱스 값 변경
		System.out.println(Arrays.toString(arr)); //따라서 카피배열을 수정했음에도 본 배열도 변형됨.
		System.out.println(arr);
		//얘는 주소를 건들였기 때문에 값이 달라짐.
		
		
		
	}

}
