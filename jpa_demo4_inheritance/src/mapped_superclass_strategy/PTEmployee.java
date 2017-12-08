package mapped_superclass_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEMO4_EMPLOYEE_PT")
public class PTEmployee extends Employee {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private int id;
	
	@Column(name="HOURLY_RATE")
	private double hourlyRate;
	
	// ********************
	// *** Constructors ***
	// ********************
	public PTEmployee() {}

	public PTEmployee(String name, int age, double hourly_rate) {
		super(name, age);
		this.hourlyRate = hourly_rate;
	}

	// *************************
	// *** Getters & Setters ***
	// *************************
	public int getId() {
		return id;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "PTEmployee [id=" + id + ", hourlyRate=" + hourlyRate + ", name=" + name + ", age=" + age + "]";
	}
	
}


