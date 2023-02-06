package PoojovsBean;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int Id;
	private String Name;
	private Double marks;
	
	public Student() {
		
	}
	
	public void Student(int Id,String Name) {
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

}
