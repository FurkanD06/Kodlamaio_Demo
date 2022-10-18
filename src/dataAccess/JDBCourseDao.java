package dataAccess;

import entities.Course;

public class JDBCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veri tabanına eklendi : " + course.getName());
		
	}

}
