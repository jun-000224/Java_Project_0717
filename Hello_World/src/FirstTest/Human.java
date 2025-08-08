package FirstTest;

public abstract class Human {
	private String name ;
	private int age ;
	private String gender ;
	private double height ;
	
	public Human(String name, int age, double height) {
		this(name, age, height, "비공개");
	}
	
	public Human(String name, int age, double height, String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	public abstract void introduce();
	
}
