package Review_day2;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {

	
	//배열의 모든 값을 음수로 만드는 메서드
	//parameter1 : 정수형 배열
    public static void minusArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];
        }
    }
    
    //배열에서 가장 큰 값을 찾아서 리턴하는 메소드
    //parameter1 : 정수형 배열
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    
    //배열의 모든 값의 합을 구해서 리턴하는 메소드
    //parameter1 : 정수형 배열
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    
    //배열에서 특정 인덱스(parameter2)의 값을 리턴하는 메소드
    //parameter1 : 정수형 배열
    //parametere2 : 정수(배열의 인덱스)
    public static int indexValue(int[] arr, int y) {
        return arr[y];
    }

    
    //배열의 평균값을 리턴하는 메소드
    public static int avg(int[] arr) {
        return sum(arr) / arr.length;
    }

    
    //배열에서 특정 값(parameter2)이 있느지 없는지 판별하는 메소드
    //parameter1 : 정수형 배열
    //parameter2 : 정수(찾고자 하는 값)
    //return : true or false (boolean)
    public static boolean searchValue(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    
    //배열에 랜덤한 값을 넣어서 만든 후 리턴해주는 메소드
    //parameter1 : 배열의 사이즈
    //parameter2 : 랜덤 숫자의 시작점
    //parametere3 : 랜덤 숫자의 마지막
    public static int[] randomArr(int x, int y, int z) {
        Random ran = new Random();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = ran.nextInt(z - y + 1) + y;
        }
        return arr;
    }

    // (1) 홀수 개수 리턴
    public static int arrLength(int[] arr, String type) {
        int count = 0;
        int num = type.equals("even") ? 0 : 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == num) {
                count++;
            }
        }
        return count;
    }

    // (2) 홀수 또는 짝수 배열 리턴 (외부에서 size를 미리 계산해서 전달함)
    public static int[] arrLength(int[] arr, String type, int size) {
        int[] result = new int[size];
        int index = 0;
        int num = type.equals("even") ? 0 : 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == num) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
    
    
    //배열 내림차순 메소드
    //1. 모든 수에 -를 붙인다. 
    //2. 오름차순 한다. 
    //3. 다시 모든 수에 -를 붙인다. 
    public static void descSort(int[] arr) {
    	
    	minusArr(arr);
    	Arrays.sort(arr);
    	minusArr(arr);
    	
    }	
    	
//    	for(int i = 1; i<arr.length-1; i++) {
//    		for(int j=1; j<arr.length; j++) {	
//    			if(arr[i]<arr[i-1]) {
//    			int backup = arr[i];
//    			arr[i]=arr[i-1];
//    			arr[i-1]=backup;
}
    			
    		
    	
    	
    	
    

