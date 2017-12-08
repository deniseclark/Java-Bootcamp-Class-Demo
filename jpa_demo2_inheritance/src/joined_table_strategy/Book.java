package joined_table_strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="DEMO2_BOOK")
@PrimaryKeyJoinColumn(referencedColumnName="PRODUCT_ID")  // Set PK of Table (Parent Class ID)
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
