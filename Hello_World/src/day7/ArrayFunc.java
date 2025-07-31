package day7;

import java.util.ArrayList;

public class ArrayFunc {


	// 가장 큰 값 구하기
    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
        	if(arr[i]>max) {
        		max = arr[i];
            }
        }
        return max;
    }

    // 평균 구하기
    public static double avgArr(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
        	sum += arr[i];
        }
        return (double) sum / arr.length; //평균값 반환
    }

    // 홀수만 모아서 새 배열로 반환
    public static int[] oddArr(int[] arr) {
    	
    	
        int count = 0; //홀수 세기 위한 변수
        for(int value : arr) {
        	if(value % 2 ==1) {
        		count++;
        	}
        }
        
        
        //홀수 카운팅
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                count++;
//            }
//        }


        
        // 새로운 배열을 생성해서 홀수값 저장하기 
        int[] arr2 = new int[count];  //새로운 배열 생성
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr2[index] = arr[i];
                index++;
            }
        }
        return arr2;
    }
        
    
    
    public static int[] bigNumArr(int[] arr) {
        int bigCount = 0;


        for (int val : arr) {
            if (val >= 8) {
                bigCount++;
            }
        }

   
        int[] bigArr = new int[bigCount];
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 8) {
                bigArr[index2] = arr[i];
                index2++;
            }
        }

        return bigArr;
    }


}


