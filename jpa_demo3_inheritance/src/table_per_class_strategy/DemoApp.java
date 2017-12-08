package table_per_class_strategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import table_per_class_strategy.Book;
import table_per_class_strategy.Software;

//**************************************************************************
//***                                                                    ***
//*** Application Description:                                           ***
//*** -----------------------                                            ***
//*** DemoApp Demonstrates the Implementation of a JPA Table per Class   ***
//*** "Inheritance Strategy".  Relational Databases do Not Understand    ***
//*** the Concept of Inheritence which is a Staple of the Java Language. ***
//*** This Demo will Illustrate how Java Inheritance can be Implemented  ***
//*** in a MySQL Relational Database using a Table per Class Strategy.   ***
//***                                                                    ***
//*** Note -> This is for Demonstration Purposes Only as the             ***
//***         "Table per Class" Strategy is Not Frequently Used          ***
//***                                                                    ***
//**************************************************************************
public class DemoApp {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("************************************************************");
		System.out.println("*** Demo #3 - JPA Inheritance Strategy (Table per Class) ***");
		System.out.println("************************************************************\n");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_inheritence_demo3");
		EntityManager em = emf.createEntityManager();
		
		// ************************************
		// *** Create Two Instances of Book ***
		// ************************************
		Book book1 = new Book();
		book1.setName("Beginner Java");
		book1.setIsbn("123-456");
		
		Book book2 = new Book("Advanced Java","123-789");		
		
		// ****************************************
		// *** Create Two Instances of Software ***
		// ****************************************
		Software software1 = new Software();
		software1.setName("Learn Java by Example");
		software1.setVersion("1.0");
		
		Software software2 = new Software("Learn Advanced Java by Example","2.0");		
		
		// *********************************************************
		// *** Persist (i.e. Insert) Each Object in the Database ***
		// *********************************************************
		try {	
			em.getTransaction().begin();
		   	em.persist(book1);
		   	em.persist(book2);
		   	em.persist(software1);
		   	em.persist(software2);
			em.getTransaction().commit();	
			System.out.println("\n%%% Successfully Created in the Database\n");
		} catch (Exception e) {
			System.out.println("%%% Unhandled Error - Database Changes Rolled Back");
			em.getTransaction().rollback();
		} finally {
			em.close();
			emf.close();
		}	
	}

}
