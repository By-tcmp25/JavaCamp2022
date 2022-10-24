package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) throws Exception {
		
		 System.out.println("Hibernate ile veritabanına eklendi : "+course.getName());
		
	}

}
