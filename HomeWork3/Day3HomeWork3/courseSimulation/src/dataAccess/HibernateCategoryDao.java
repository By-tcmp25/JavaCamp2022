package dataAccess;

import entities.Catogory;

public class HibernateCategoryDao implements CatogoryDao{

	@Override
	public void add(Catogory category) {
		System.out.println("Hibernate ile veritabanına eklendi : "+category.getCatogoryName());
		
	}

	
}
