package Review_day2;

import java.util.Arrays;
import java.util.Random;

public class Array6 {
	public static void main(String[] args) {
        // 공간은 10개, 숫자범위는 1~30
        int arr[] = ArrayFunc.randomArr(10, 1, 30);
        System.out.println("원본 배열: " + Arrays.toString(arr));
        //오름차순 -> Arrays.sort(arr)
        //내림차순 -> ArrayFunc.descSort(arr);
        ArrayFunc.descSort(arr);
        System.out.println(Arrays.toString(arr ));
        
//         {{1,2},{3,4,5},{5,6}}
//         {
//	        	{1,2},
//	        	{3,4,5},
//	        	{5,6}
//        	}
        
        //new int[3][2] 3행 2열 배열
        
        int arr2[][] = {
			        		{10,5},
			        		{3,7},
			        		{2,9}	
        				};
        // arr2[0] = {10, 5}
        // arr2[1] = {3, 7}
        // arr2[2][1] => 9

        
        // arr2가 갖고 있는 모든 값의 합을 구하시오.
        
        int sum = 0;
        
//        for(int i=0; i<arr2.length; i++) {
//        	for(int j=0; j<arr2[i].length; j++) {
//        		sum += arr2[i][j];
//        	}
//        }
        
        for(int i=0; i<arr2.length; i++) {
        	sum += ArrayFunc.sum(arr2[i]); 
        }
        System.out.println(sum);
        
        // -----------------------------------------------------
        //4*5배열에 랜덤한 숫자 넣기, 범위는 10 ~ 50
        int arr3[] []= new int [4][5];
        
        Random rans = new Random();
        
        for(int	i=0; i<arr3.length; i++) {
        	for(int j=0; j<arr3[i].length; j++) {
                int random = rans.nextInt(41)+10;
        		arr3[i][j]=random;
        	}
        	
        }
        System.out.println(Arrays.deepToString(arr3));
        
        
}
}
