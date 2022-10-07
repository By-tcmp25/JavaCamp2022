package oopWithNLayerdApp;

import java.awt.image.DataBuffer;

import oopWithNLayerdApp.business.ProductManager;
import oopWithNLayerdApp.core.logging.FileLogger;
import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.jdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1,"iphone 12 mini",20000);
		
		Logger[] logger = {};
		
		ProductManager productManager =
				new ProductManager(new jdbcProductDao());
		productManager.add(product1);
		
		
		
		
		
		// 3.Ders yayın kodları 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
