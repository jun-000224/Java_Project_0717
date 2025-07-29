package Review_day1;

public class TV {
	
	//클래스 내에만 접근하는 필드 생성
	private int size;
	
	
	//생성자 만들기 (객체 생성시 초기화 하기 위해서 -> 기본 세팅값 )
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}
