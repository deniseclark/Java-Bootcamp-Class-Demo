package composition_1toM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//**************************************************************************
//***                                                                    ***
//*** Application Description:                                           ***
//*** -----------------------                                            ***
//*** DemoApp Demonstrates the Implementation of a JPA Composition       ***
//*** Using a 1:M and M:1 Relationship.                                  ***
//*** This Model Assumes the following:                                  ***
//*** - ONE University may have MANY Students Enrolled                   ***
//*** - MANY Students may attend ONE University                          ***
//***                                                                    ***
//**************************************************************************
public class DemoApp {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("**************************************************");
		System.out.println("*** Demo #6 - JPA Composition 1:M Relationship ***");
		System.out.println("***************************************************\n");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo6_composition_1toM");
		EntityManager em = emf.createEntityManager();

		// ***********************************************************
		// *** Create an Instance of University and Add 3 Students ***
		// ***********************************************************
		University university1 = new University("University of Cincinnati");
		Student student1 = new Student("John","Doe", university1);
		Student student2 = new Student("Mary","Smith", university1);
		Student student3 = new Student("James","Anderson", university1);
	
		// **************************************************************
		// *** Create a 2nd Instance of University and Add 3 Students ***
		// **************************************************************
		University university2 = new University("University of Dayton");
		Student student4 = new Student("Lisa","Williams", university2);
		Student student5 = new Student("Mike","Clark", university2);
		Student student6 = new Student("Shannon","Baker", university2);
		
		// *********************************************************
		// *** Persist (i.e. Insert) Each Object in the Database ***
		// *********************************************************
		try {
			em.getTransaction().begin();
			em.persist(university1);
			em.persist(student1);
			em.persist(student2);
			em.persist(student3);
			em.persist(university2);
			em.persist(student4);
			em.persist(student5);
			em.persist(student6);
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