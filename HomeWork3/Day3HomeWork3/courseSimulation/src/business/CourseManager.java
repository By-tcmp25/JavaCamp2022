package business;
import coreLogging.ILogger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager extends Course implements CourseDao{
	
	private CourseDao coursedao;
	private ILogger[] loggers;

	public CourseManager(CourseDao coursedao, ILogger[] loggers) {
        this.coursedao = coursedao;
        this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {
		Course[] courses = {new Course("java 2022",100), new Course("java 2021", 25)};
		for (Course Corusess : courses) {
			if(course.getName() == Corusess.getName()) {
				throw new Exception("isim tekrarlanamaz");
			}else if(course.getPrice() < 0 ) {
					throw new Exception("kursun fiyatı 0 dan küçük olamaz");
				}
		}
			 coursedao.add(course);
		        for (ILogger logger : loggers) {
		            logger.log(course.getName());
		}
		        
	}
	
}
