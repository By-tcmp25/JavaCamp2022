package dataAccess;

import entities.ınstructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(ınstructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi : " + instructor.getName());
		
	}

}
