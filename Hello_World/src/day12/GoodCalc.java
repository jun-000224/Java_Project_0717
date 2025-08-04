package day12;

import day7.ArrayFunc;

public class GoodCalc extends Calculator{
	
	

	
		public int subtract(int a, int b) {
			return a-b;
		}
		
		public double average(int[] a) {
			return ArrayFunc.avgArr(a);
		}
}
