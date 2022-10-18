package business;
import core.ILoggers;
import dataAccess.IInstructorDao;
import entities.Instructor;

public class InstructorManager {
	IInstructorDao iInstructorDao;
	ILoggers[] iLoggers;
	public InstructorManager(IInstructorDao iInstructorDao,ILoggers[] iLoggers) {
		
		this.iInstructorDao = iInstructorDao;
		this.iLoggers = iLoggers;
	}
	
	public void add(Instructor instructor) {
		iInstructorDao.add(instructor);
		
		for (ILoggers loggers: iLoggers) {
			loggers.log(instructor.getFirstName()+ " " + instructor.getLastName());
		}
	}
	
	
	
	
}
