package Review_day1;

public class CarMain {
	
	public static void main(String[] args) {
				
		Car car = new Car("카마로", 60000000);
		car.printInfo();
		
		System.out.println();
		
		ElectricCar e = new ElectricCar("폭스바겐뉴비틀", 70000000, 2000000);
		e.printInfo();
		
	}
}
