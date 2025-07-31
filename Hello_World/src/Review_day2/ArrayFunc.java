package review_day2;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {
	
	public static final int EVEN = 0;
	public static final int ODD =1;
	
//	private ArrayFunc() {}; -> 객체 생성 불가능하도록 생성자를 private로 선언, static으로만 써라.
	
	// 배열의 모든 값을 음수로 만드는 메소드
	// parameter1 : 정수형 배열
	public static void minusArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
	}
	
	// 배열에서 가장 큰 값을 찾아서 리턴하는 메소드
	// parameter1 : 정수형 배열
	public static int max(int[] arr) {
		int maxValue = arr[0];
		// {5, 8, 2, 6, 10, 4}
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	// 배열의 모든 값의 합을 구해서 리턴하는 메소드
	// parameter1 : 정수형 배열
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	// 배열에서 특정 인덱스(parameter2)의 값을 리턴하는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 정수 (배열의 인덱스)
	public static int indexValue(int[] arr, int index) {
		return arr[index];
	}
	
	
	// 배열의 평균값을 리턴하는 메소드
	// parameter1 : 정수형 배열
	public static double avg(int[] arr) {
		double avgArr = (double) sum(arr)/arr.length;
		
		return avgArr; 
	}
	
	// 배열에서 특정 값(parameter2)이 있는지 없는지 판별하는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 정수(찾고자 하는 값)
	// return : true or false (boolean)
	public static boolean searchValue(int[] arr, int value) {
		for(int i=0; i<arr.length; i++) {
			if(value == arr[i]) {
				return true;
			}
		}
		return false;
	}
			
	// 배열에 랜덤한 값을 넣어서 만든 후 리턴해주는 메소드
	// parameter1 : 배열의 사이즈
	// parameter2 : 랜덤숫자의 시작 숫자
	// parameter3 : 랜덤숫자의 끝 숫자
	// return : 랜덤숫자가 담긴 배열
	public static int[] randomArr(int size, int first, int last) {
		int arr[] = new int[size];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(last-first+1) + first;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		return arr;
		
	}		
	
	// 배열에서 홀수(odd), 짝수(even)의 개수를 리턴해주는 메소드
	// parameter1 : 정수형 배열
	// parameter2 : 홀수, 짝수 구분 문자열(odd or even)
	// ** kind에 odd,even 외에 값에 대한 예외처리 필요 **
	public static int arrLength(int[] arr, String kind) {
		int size = 0;
		int num = kind.equals("even") ? 0 : 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == num) {
				size++;
			} 
		}
		return size;
	}

	// 배열에서 홀수(odd), 짝수(even)를 따로 분류해서 배열로 만든 후 리턴
	// parameter1 : 정수형 배열
	// parameter2 : 문자열 => 홀수, 짝수 구분 문자열(odd or even)
	// parameter3 : 정수 => 홀수 혹은 짝수 배열의 개수
	// ** kind에 odd,even 외에 값에 대한 예외처리 필요 **
	public static int[] returnArr(int[] arr, String kind, int size) {
		// TODO Auto-generated method stub
		int newArr[] = new int[size];
		int index = 0;
		int num = kind.equals("even") ? 0 : 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == num) {
				newArr[index++] = arr[i];
			}
		}
		
		return newArr;
	}

	// 배열에서 홀수(odd), 짝수(even)를 따로 분류해서 배열로 만든 후 리턴
	// parameter1 : 정수형 배열
	// parameter2 : 문자열 => 홀수, 짝수 구분 문자열(odd or even)
	// ** kind에 odd,even 외에 값에 대한 예외처리 필요 **
	public static int[] returnArr(int[] arr, String kind) {
		// TODO Auto-generated method stub
		
		return returnArr(arr, kind, arrLength(arr, kind));
	}

	public static void descSort(int[] arr) {
		// TODO Auto-generated method stub
		// 1. 모든 수에 -를 붙인다.
		// 2. 오름차순 한다
		// 3. 모든 수에 -를 붙인다.
		minusArr(arr);
		Arrays.sort(arr);
		minusArr(arr);
		
	}
	
	

}