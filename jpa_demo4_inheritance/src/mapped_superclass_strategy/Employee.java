package mapped_superclass_strategy;

import javax.persistence.MappedSuperclass;

// **********************************************************
// *** Abstract Employee Class -                          ***
// *** No Entity Annotation (NOT Created in the Database) ***
// **********************************************************
@MappedSuperclass
public class Employee {
	
	protected String name;
	protected int age;
	
	// ********************
	// *** Constructors ***
	// ********************
	public Employee() {};
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// *************************
	// *** Getters & Setters ***
	// *************************
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
