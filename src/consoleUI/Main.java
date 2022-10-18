package consoleUI;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.ILoggers;
import core.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JDBCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		ILoggers[] loggers = {new FileLogger(), new DatabaseLogger()};
		
		Course course = new Course(1, "C# Yazılım Geliştirici Yetiştirme Kampı",70);	
		CourseManager courseManager = new CourseManager(new JDBCourseDao(), loggers);
		courseManager.add(course);	
		
		System.out.println("____________________________________");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		Category category = new Category(1, "C#");	
		categoryManager.add(category);
		
		System.out.println("____________________________________");
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		
		
		
		

	}

}
