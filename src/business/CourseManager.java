package business;

import java.util.ArrayList;
import java.util.List;

import core.ILoggers;
import dataAccess.ICourseDao;
import entities.Course;

public class CourseManager {
	ICourseDao courseDaos;
	ILoggers[] iLoggers;

	List<Course> courses = new ArrayList<>();

	public CourseManager(ICourseDao courseDaos, ILoggers[] iLoggers) {
		this.courseDaos = courseDaos;
		this.iLoggers = iLoggers;

	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}

		for (Course course1 : courses) {
			if (course1.getName().equals(course.getName())) {
				throw new Exception("Kurs ismi aynı olamaz");
			}

		}

		courses.add(course);
		courseDaos.add(course);
		
		for (ILoggers iLoggers : iLoggers) {
			iLoggers.log(course.getName());
		}

	}

}
