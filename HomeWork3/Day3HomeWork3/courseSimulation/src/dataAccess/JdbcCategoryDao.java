package dataAccess;

import entities.Catogory;

public class JdbcCategoryDao implements CatogoryDao{

	@Override
	public void add(Catogory category) {
		System.out.println("Jdbc ile veritabanına eklendi : " + category.getCatogoryName());
		
	}

}
