package Quiz;

public class GamingLaptop extends Laptop{
	
	String gpu;

	public GamingLaptop(String brand, double weight, String gpu) {
		super(brand, weight);
		this.gpu = gpu;
	}

	public void printSpecs() {
		System.out.println(getBrand() + "의 "  + weight + "kg " + gpu + " 게이밍 노트북");
		
	}
	
	

}
