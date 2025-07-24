package day7;

import java.util.Arrays;

public class ReviewMain2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		b = 15; //a값에는 전혀 영향이 없음.
		System.out.println(a);
		
		Fruit_R orange = new Fruit_R("오렌지", 1000);
		Fruit_R jejuOrange = orange; //오렌지의 주소 공유
//		Fruit_R jejuOrange = new Fruit_R -> 이렇게 독립적인 개체를 만들어야함.
		
		System.out.println(orange.getPrice());
		jejuOrange.setPrice(2000);
		System.out.println(orange.getPrice());
		
//		int arr[] = {1,3,2,4,5};
//		int arr2[] = arr;
//		arr2[2]=99999;
//		System.out.println(Arrays.toString(arr2));
		
		int arr[] = {1,3,2,4,5};
		int arr2[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
