package Review_day2;

import java.util.Arrays;

public class Array4 {

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

        // 개수 카운팅 후 배열 선언
        int oddArr[] = new int[oddCount];
        int evenArr[] = new int[evenCount];

        // 홀수, 짝수 분리해서 집어넣기
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }

        System.out.println("홀수 배열: " + Arrays.toString(oddArr));
        System.out.println("짝수 배열: " + Arrays.toString(evenArr));
    }
}
