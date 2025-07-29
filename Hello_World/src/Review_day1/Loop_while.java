package Review_day1;

public class Loop_while {

	public static void main(String[] args) {
		
		
		int i = 0;
		
		//for(int i = 0; i<=10)
		while(i<=4) {  //i가 20보다 작을 때 빠져나감, false가 될 때
			int j = 0;
			i++;
			while(j<=4) {
				j++;
				System.out.print("(" + i + "," + j + ")");	
			}
			System.out.println();

			
			
		}
	}

}
