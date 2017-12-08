package table_per_class_strategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="DEMO3_BOOK")
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
