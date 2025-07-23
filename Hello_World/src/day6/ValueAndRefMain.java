package day6;

import java.util.Arrays;

public class ValueAndRefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueAndRef v = new ValueAndRef();
		
		int x = 10;
		v.valueTest(x);
		System.out.println(x);
		
		x = v.valueTest2(x);
		System.out.println(x);
		
		int arr[] = {1,2,3,4,5};
		v.refTest(arr); //배열은 주소값을 가지고 있음. 0x1234(이런식의 주소)
		
		System.out.println(Arrays.toString(arr));
	}

}
