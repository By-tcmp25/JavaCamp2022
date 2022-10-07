package oopWithNLayerdApp.business;

import java.util.List;

import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private List<Logger> loggers;
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz.");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) { // [db,mail]
			logger.log(product.getName());
		}
		
	}
}
