package mapped_superclass_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEMO4_EMPLOYEE_FT")
public class FTEmployee extends Employee {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private int id;
	
	@Column(name="ANNUAL_SALARY")
	private double salary;
	
	// ********************
	// *** Constructors ***
	// ********************
	public FTEmployee() {}

	public FTEmployee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	// *************************
	// *** Getters & Setters ***
	// *************************
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FTEmployee [id=" + id + ", salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	

}
