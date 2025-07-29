package Review_day1;

public class ElectricCar extends Car{
	
	private int battery;
	
	ElectricCar(String model, int price, int battry){
		super(model, price);
		this.battery = battery;
	}
	
	public void printInfo() {
		System.out.println("모델명 : " + getModel());
		System.out.println("가격 : " + getPrice());
		System.out.println("배터리 용량 : " + battery);
		
	}

}
