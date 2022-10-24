package dataAccess;

import entities.ınstructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(ınstructor instructor) {
		 System.out.println("Hibernate ile veritabanına eklendi : "+instructor.getName());
		
	}

}
