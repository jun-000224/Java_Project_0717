package day5;

public class Day4_Review3 {

	public static void main(String[] args) {
		int arr[] = {3,5,1,4,2};
		
		//가장 작은 값 찾기
		
		int minIndex = 0;
		
		for(int i=1; i<arr.length; i++) {
			if (arr[i]<arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println("최소값은 " + arr[minIndex]+" 입니다.");
	}

}
