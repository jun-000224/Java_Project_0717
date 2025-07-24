package day7;

import java.util.Arrays;

public class Array_Main {
    public static void main(String[] args) {
        int arr[] = {3, 5, 12, 8, 15, 7};

        int max = ArrayFunc.maxArr(arr);
        System.out.println("가장 큰 값 : " + max);

        double avg = ArrayFunc.avgArr(arr);
        System.out.println("평균 값 : " + avg);

        int oddArr[] = ArrayFunc.oddArr(arr);
        System.out.println("홀수들만 도출한 배열 : " + Arrays.toString(oddArr));
        
        
        
        
        //ArrayFunc 클래스 안에 bigNumArr메소드 만들기
        //배열에서 8이상의 숫자만 따로 떼서 리턴해주는 bigNumArr메소드 구현  
        int bigNumArr[] = ArrayFunc.bigNumArr(arr); // ✅ 메소드 호출은 () 사용
        System.out.println("8이상의 숫자 배열 " + Arrays.toString(bigNumArr));
    }
}
