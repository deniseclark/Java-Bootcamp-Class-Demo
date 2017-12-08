package single_table_strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value="B")    
public class Book extends Product {

	private String isbn;
	
	// ********************
	// *** Constructors ***
	// ********************
	public Book() {}  
	
	public Book (String name, String isbn) {
		super(name);         
		this.isbn = isbn;  
	}

	// *************************
	// *** Getters & Setters ***
	// *************************
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + "]";
	}

	
}
