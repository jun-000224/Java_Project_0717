package day7;

public class ColorTV extends TV {

	// 부모 클래스에 없는 추가 필드 작성
	private int color;

	// 생성자
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	};

	// 메소드
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}

	public void printProperty(int size, int color) {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}

	protected int getColor() {
		return color;
	}

}
