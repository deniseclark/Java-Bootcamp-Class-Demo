package mapped_superclass_strategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//**************************************************************************
//***                                                                    ***
//*** Application Description:                                           ***
//*** -----------------------                                            ***
//*** DemoApp Demonstrates the Implementation of a JPA Mapped SuperClass ***
//*** "Inheritance Strategy".  Relational Databases do Not Understand    ***
//*** the Concept of Inheritance which is a Staple of the Java Language. ***
//*** This Demo will Illustrate how Java Inheritance can be Implemented  ***
//*** in a MySQL Relational Database using a Mapped Superclass Strategy. ***
//***                                                                    ***
//**************************************************************************
public class DemoApp {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("**************************************************************");
		System.out.println("*** Demo #4 - JPA Inheritance Strategy (Mapped Superclass) ***");
		System.out.println("**************************************************************\n");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_inheritence_demo4");
		EntityManager em = emf.createEntityManager();
		
		// ****************************************************
		// *** Create Two Instances of a Full Time Employee ***
		// ****************************************************
		FTEmployee emp1 = new FTEmployee();
		emp1.setName("Mary");
		emp1.setAge(39);
		emp1.setSalary(125000.00);
		
		FTEmployee emp2 = new FTEmployee("John", 41, 92800.00);
		
		// ****************************************************
		// *** Create Two Instances of a Part Time Employee ***
		// ****************************************************
		PTEmployee emp3 = new PTEmployee();
		emp3.setName("Charlie");
		emp3.setAge(25);
		emp3.setHourlyRate(50.75);
		
		PTEmployee emp4 = new PTEmployee("Lucy", 29, 42.50);
	
		// *********************************************************
		// *** Persist (i.e. Insert) Each Object in the Database ***
		// *********************************************************
		try {	
			em.getTransaction().begin();
		   	em.persist(emp1);
		   	em.persist(emp2);
		   	em.persist(emp3);
		   	em.persist(emp4);
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