package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entities.Product;

public class jdbcProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır ... SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
}

