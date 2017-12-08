package joined_table_strategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;

@Entity
@Inheritance (strategy=InheritanceType.JOINED) 
@Table (name="DEMO2_PRODUCT")
@DiscriminatorColumn (name="PRODUCT_TYPE")   // Column to Specify if the Product
public class Product {                       // is Software or a Book
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="PRODUCT_ID")
	private int id;
	
	@Column (name="PRODUCT_NAME")
	protected String name;

	// ********************
	// *** Constructors ***
	// ********************
	public Product() {}

	public Product(String name) {
		this.name = name;
	}
	
	// *************************
	// *** Getters & Setters ***
	// *************************
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
