package table_per_class_strategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="DEMO3_SOFTWARE")
public class Software  extends Product {

	private String version;
	
	// ********************
	// *** Constructors ***
	// ********************
	public Software() {}  
	
	public Software (String name, String version) {
		super(name);         
		this.version = version;  
	}

	// *************************
	// *** Getters & Setters ***
	// *************************
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Software [version=" + version + ", name=" + name + "]";
	}
}
