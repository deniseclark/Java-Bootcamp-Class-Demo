package composition_1toM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEMO6_STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STUDENT_ID")
    private int id;
	
	@Column(name="FIRST_NAME")
	String firstName;
	
	@Column(name="LAST_NAME")
	String lastName;
	
	// ********************************************************
	// *** Use Composition to Model a M:1 Relationship      ***
	// *** From STUDENT to UNIVERSITY                       ***
	// *** (MANY Students may Attend ONE UNIVERSITY)        ***
	// *** You will Need to Alter the Table to Rename the   ***
	// *** FK if JPA is Generating your Tables              ***
	// ********************************************************
	@ManyToOne  
	private University university;

	// ********************
	// *** Constructors ***
	// ********************
	public Student() {}
	
	public Student(String firstName, String lastName, University university) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.university = university;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
}
