package composition_1to1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEMO5_EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
    private int id;
	
	@Column(name="NAME")
	String name;
	
	// *******************************************************
	// *** Use Composition to Model a 1:1 Relationship     ***
	// *** Employee "has a 1:1 Relationship with Address   ***
	// ***                                                 ***
	// *** The mappedBy="employee" Parameter Designates the***
	// *** EMPLOYEE as the OWNING Side of the Relationship ***
	// *** and Dictates that the ADDRESS Table must Carry  ***
	// *** a FK of EMPLOYEE_ID.  The EMPLOYEE Table will   ***
	// *** NOT Carry a FK of ADDRESS_ID (Redundant)        ***
	// *******************************************************
	@OneToOne(mappedBy="employee")  // Define FK in ADDRESS Table
	private Address address;

	// ********************
	// *** Constructors ***
	// ********************
	public Employee() {}
	
	public Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	// ***************************
	// *** Getters and Setters ***
	// ***************************
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}	
}
