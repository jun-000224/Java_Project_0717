package day3;

import java.util.Scanner;

public class Loop_While1 {

	public static void main(String[] args) {
		
//		int i=0;
//		while(i<10) {
//			System.out.println("i");
//			i++;
			
		//1부터 사용자가 입력한 숫자까지 합을 구하기
		//while문 사용하기
		
		//2. 구구단 (while문)
			
//		int sum = 0;
//				
//		Scanner s = new Scanner(System.in);
//		System.out.println("수 입력 : ");
//		
//		int num = s.nextInt();
//		int i = 1;
//		while(i <= num) {
//			sum +=i;
//			i++;	
//		}
//		System.out.println(sum);
//		System.out.println();
//		
		
		int i= 2;
		while(i<= 9) {
			int j = 1; //내가 이거 안함
			while(j <=9) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			i++;	
		}
			
		}
	}


