package day12;

public class Pizza extends Food{

	public Pizza(String name) {
		super(name);
	}
	
	
	@Override
	public String toString() {
		return "피자는 맛있다!";
	}

}
