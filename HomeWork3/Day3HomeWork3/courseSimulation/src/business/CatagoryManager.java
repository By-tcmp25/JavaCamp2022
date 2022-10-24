package business;

import coreLogging.ILogger;
import dataAccess.CatogoryDao;
import entities.Catogory;

public class CatagoryManager {
	
	 private CatogoryDao categoryDao;
	    private ILogger[] loggers;

	    public void CatogoryManager(CatogoryDao categoryDao, ILogger[] loggers) {
	        this.categoryDao = categoryDao;
	        this.loggers = loggers;
	    }

	    public void add(Catogory category) throws Exception {
	        Catogory[] categories = {new Catogory(), new Catogory(), new Catogory()};
	        for (Catogory c : categories) {
	            if (category.getCatogoryName() == c.getCatogoryName()) {
	                throw new Exception("Kategori ismi tekrar edemez.");
	            }
	        }
	        categoryDao.add(category);
	        for (ILogger logger : loggers) {
	            logger.log(category.getCatogoryName());
	        }
	    }
}
