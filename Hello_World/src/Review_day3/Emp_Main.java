package Review_day3;

public class Emp_Main {

	public static void main(String[] args) {
		
		Employee kim = new Employee(1001, "김철수");
		Employee park = new Employee(2002, "박영희", "인사부");

		kim.setDetails(300000, "대리");
		int a = kim.getSalary();
		System.out.println(a);
		
		park.empInfo();
		
		
		
	}

}
