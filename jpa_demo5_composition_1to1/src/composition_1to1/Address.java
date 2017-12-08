package composition_1to1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEMO5_ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
    private int id;
	
	@Column(name="ADDRESS")
	String address;
	@Column(name="CITY")
	String city;
	@Column(name="STATE_CODE")
	String state;
	@Column(name="ZIP_CODE")
	String zip;	
	
	// ******************************************************
	// *** Use Composition to Model a 1:1 Relationship    ***
	// *** Instead of using Inheritance.                  ***
	// *** Address "has a 1:1 Relationship with Employee  ***
	// ******************************************************
	@OneToOne
	private Employee employee;

	// ********************
	// *** Constructors ***
	// ********************
	public Address() {}
	
	public Address(String address, String city, String state, String zip) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}

