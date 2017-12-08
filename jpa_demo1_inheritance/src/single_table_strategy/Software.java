package single_table_strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value="S") 
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
