package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
	    System.out.println("Hibernate ile veri tabanına eklendi : " +instructor.getFirstName() +" " +instructor.getLastName() );
		
	}

}
