package day6;

public class Calc_Review {

		//오버로딩
		//*동일한 이름의 메소드를 여러개 정의하는 것.
		//그럼 데이터 타입이 다른 애들을 넣었을때, 알아서 알맞는걸로 계산됨.
		//매개변수의 개수나 타입이 달라야 함.
		//리턴타입으로는 구분할 수 없다. 
	
		int sum(int x, int y) {
			return x+y;
		}
		
		double sum(double x, int y) {
			return x+y;
		}
		
		double sum(double x, double y) {
			return x+y;
		}
		
		int sum(int x, int y, int z) {
			return x+y+z;
		}
}
