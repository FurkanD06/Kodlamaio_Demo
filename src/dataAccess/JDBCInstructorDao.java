package dataAccess;

import entities.Instructor;

public class JDBCInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veri tabanına eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

}
