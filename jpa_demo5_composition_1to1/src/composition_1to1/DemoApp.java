package composition_1to1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//**************************************************************************
//***                                                                    ***
//*** Application Description:                                           ***
//*** -----------------------                                            ***
//*** DemoApp Demonstrates the Implementation of a JPA Composition       ***
//*** Using a 1:1 Relationship.  Composition does Not Use Inheritance.   ***
//***                                                                    ***
//**************************************************************************
public class DemoApp {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("**************************************************");
		System.out.println("*** Demo #5 - JPA Composition 1:1 Relationship ***");
		System.out.println("***************************************************\n");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo5_composition_1to1");
		EntityManager em = emf.createEntityManager();

		// *********************************************************
		// *** Create an Instance of Employee and their Address  ***
		// *********************************************************
		Address addr1 = new Address("100 Java Happy-Path Lane","Mason","OH","45040");
		Employee emp1 = new Employee();
		emp1.setName("Sean Blessing");
		emp1.setAddress(addr1);          // Set Address in Employee
        addr1.setEmployee(emp1);         // Set Employee in Address

		// *********************************************************
		// *** Create a Second Instance of Employee and Address  ***
		// *********************************************************
		Address addr2 = new Address("999 Bootcamper Counseling St","Mason","OH","45040");
		Employee emp2 = new Employee();
		emp2.setName("Greg Doud");
		emp2.setAddress(addr2);
        addr2.setEmployee(emp2);
        
		// ********************************************************
		// *** Create a Third Instance of Employee and Address  ***
		// ********************************************************
		Address addr3 = new Address("911 Triage-It Blvd","Mason","OH","45040");
		Employee emp3 = new Employee();
		emp3.setName("Lisa Slutsky");
		emp3.setAddress(addr3);
        addr3.setEmployee(emp3);
        
		// *********************************************************
		// *** Persist (i.e. Insert) Each Object in the Database ***
		// *********************************************************
		try {
			em.getTransaction().begin();
			em.persist(emp1);
			em.persist(addr1);
			em.persist(emp2);
			em.persist(addr2);
			em.persist(emp3);
			em.persist(addr3);
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