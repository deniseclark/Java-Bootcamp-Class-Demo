package table_per_class_strategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS) // FYI -Not Supported by JPA Providers
@Table (name="DEMO3_PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)  // Changed from AUTO
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
