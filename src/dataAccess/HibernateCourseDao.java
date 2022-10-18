package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao {

	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi : " + course.getName());
		
	}

}
