package Review_day1;

import java.util.Arrays;
import java.util.Random;

public class Last2 {

	public static void main(String[] args) {
		
		String[] subjectArr = {"JAVA", "oracle", "html", "javascript", "css"};
		int[] scoreArr = {90,85, 60, 95,100};
		
		int j = 0;
		int count = 0;
		String[] Arr = new String[count];
		//반복문 시작
		for(int i=0; i<subjectArr.length; i++) {
	
		
		int sum = 0;
			sum += scoreArr[i];
			
			if((sum / subjectArr.length) < scoreArr[i] ) {
				count++;  //배열 공간 결정하기
				j++;
				Arr[j] = subjectArr[i];
				
			}
		}
		System.out.println(Arrays.toString(Arr));

		
	}

}
