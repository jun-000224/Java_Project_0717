package Review_day3;

public class Employee {
	
	int empId;
	String empName;
	String department;
	int salary;
	String position;
	
	
	public Employee() {}
	
	public Employee(int empId, String name) {
		this(empId, name, "");
	}
	
	
	
	
	public Employee(int empId, String name, String department) {
		this.empId = empId;
		this.empName = name;
		this.department = department;
	}
	
	
	public  void setDetails(int salary, String position) {
		this.salary = salary;
		this.position = position;
	}
	
	
	public int getSalary() {
		return this.salary;
	}
	
	
	public void empInfo() {
		System.out.println(empName + "사원의 사번은" + empId + " 직급은 " + position);
	}

}
