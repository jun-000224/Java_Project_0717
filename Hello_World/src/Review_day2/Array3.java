package Review_day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// 1. 사용자 입력을 받아 배열에 저장하고 평균 출력
//		Scanner s = new Scanner(System.in);
//		int[] arr = new int[5];
//		int sum = 0;
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println((i + 1) + "번째 숫자를 입력하세요:");
//			arr[i] = s.nextInt();
//			sum += arr[i];
//		}

//		System.out.println("입력된 배열: " + Arrays.toString(arr));
//		System.out.println("합계: " + sum);
//		System.out.println("평균: " + ((double) sum / arr.length));

		//-----------------------------------------------

		// 2. 1~10 사이의 중복 없는 랜덤 숫자 5개 생성하고, 가장 큰 수 출력
		int[] arr2 = new int[5];
		Random ran = new Random();
		int i = 0;

		while (i < 5) {
			int random = ran.nextInt(10) + 1;
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr2[j] == random) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				arr2[i] = random;
				i++;
			}
		}

		// 최댓값 구하기 
		int max = arr2[0];
		for (int j = 1; j < arr2.length; j++) {
			if (arr2[j] > max) {
				max = arr2[j];
			}
		}

		System.out.println("랜덤 배열: " + Arrays.toString(arr2));
		System.out.println("최댓값: " + max);
		
		
		int[] arr3 = ArrayFunc.randomArr(5, 20 , 100);
		//첫 번째 파라미터 : 랜덤한 숫자의 개수(배열의 크기)
		//두 번째 파라미터 : 랜덤한 숫자의 시작점
		//세 번째 파라미터 : 랜덤한 숫자의 끝
		
		System.out.println(Arrays.toString(arr3));
		
		
		int[] arr4 = ArrayFunc.randomArr(10, 50, 200);
		System.out.println(Arrays.toString(arr4));
	
	}
		

	}
