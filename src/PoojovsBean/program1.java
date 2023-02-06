package PoojovsBean;

public class program1 {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setId(101);
		emp.name="Srikanth reddy";
		emp.salary=(double) 55000;

		Employee emp1=new Employee();
		emp.setId(102);
		emp.name="Sudheerreddy";
		emp.salary=(double) 85000;

		Employee emp2=new Employee();
		emp.setId(103);
		emp.name="Karthik reddy";
		emp.salary=(double) 95000;
		
		Employee[] employee=new Employee[] {emp,emp1,emp2};
		
		
		
	}
	

}
