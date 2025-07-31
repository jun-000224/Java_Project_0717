package Quiz;

public class Laptop extends Computer{
	
	//필드
	double weight;
	
	public Laptop(String brand, double d) {
		super(brand);
		this.weight = d;
	}

	public void printSpecs() {
		System.out.println(getBrand() + "브랜드의 " + weight + " 노트북");
	}
	
	
	
	

}
