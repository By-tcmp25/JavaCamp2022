package business;

import coreLogging.ILogger;
import dataAccess.InstructorDao;
import entities.ınstructor;

public class ınstructorManager extends ınstructor {

	private InstructorDao instructorDao;
    private ILogger[] loggers;

    public void InstructorManager(InstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(ınstructor instructor) {
        instructorDao.add(instructor);
        for (ILogger logger : loggers) {
            logger.log(instructor.getName());
        }
    }
}
