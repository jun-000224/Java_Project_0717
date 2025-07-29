package Review_day1;

public class Car {
	
	//필드 영역
	private	String model;    //모델명
	private int price;		 //가격
	
	
	//생성자
	public Car(String m, int p){
		this.model = m;
		this.price = p;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int p) {
		this.price = p;
	}
	
	public void printInfo() {
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price);
	}

}
