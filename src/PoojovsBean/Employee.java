package PoojovsBean;

public class Employee {
	
	private int Id;
	public String name;
	protected Double salary;
	
	
	public Employee() {
		
	}
	public Employee(int Id) {
		this.Id=Id;
	}
	public void setId(int Id) {
		this.Id=Id;
	}

	public int getId() {
		return Id;
	}
}
