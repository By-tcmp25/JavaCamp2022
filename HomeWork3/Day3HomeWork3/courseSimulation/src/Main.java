import entities.*;
import dataAccess.*;
import coreLogging.*;
import business.*;

public class Main {

	public static void main(String[] args) {
		
		ILogger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};

        Catogory category1 = new Catogory("java",12);
        CatagoryManager categoryManager = new CatagoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        Course course1 = new Course(3, "Kotlin", "Mobil programing", 0);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

        ınstructor instructor = new instructor(1, "Engin", "Demiroğ");
        ınstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);
		
		
		
		

	}

}
