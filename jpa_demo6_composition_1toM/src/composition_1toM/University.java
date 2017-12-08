package composition_1toM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEMO6_UNIVERSITY")
public class University {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UNIVERSITY_ID")
    private int id;  
	@Column(name="NAME")
	String name;
	
	// *******************************************************
	// *** The "One" Represents this Entity and the "Many" ***
	// *** "Many" Represents the (List of) Student Entity  ***
	// ***                                                 ***
	// *** The "mappedBy" Parameter Defines that in the    ***
	// *** Student Class the University will have the name ***
	// *** "university".  This Name MUST Match the Name    ***
	// *** Specified in the "@ManyToOne" Defined in the    ***
	// *** Student Class                                   ***
	// *** The "mappedBy" Parameter Makes Sure the         ***
	// *** that the University Id is NOT Stored Redundantly***
	// *** in the UNIVERSITY Table for Every Student       ***
	// *** Attending the Same University.                  ***
	// *******************************************************
	@OneToMany(mappedBy="university")
	private List<Student> students;

	// ********************
	// *** Constructors ***
	// ********************
	public University() {
		this.students = new ArrayList<>(); // Initialize Student List
	}
	
	// ***************************
	// *** Getters and Setters ***
	// ***************************
	public University(String name) {
		this();  // Call DEFAULT Constructor - Prevent NullPointer Exception
		this.name = name;
	}
	public int getIdd() {
		return id;
	}
	public void setUniversityId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	// *****************************************************
	// *** Required "Helper" Method for 1:M Relationship ***
	// *****************************************************
	public void addStudent(Student student) {
       this.students.add(student);		
	}
}

