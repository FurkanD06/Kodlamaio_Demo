package business;

import java.util.ArrayList;
import java.util.List;

import core.ILoggers;
import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {
	ICategoryDao categoryDao;
	List<Category> categories = new ArrayList<>();
	ILoggers[] iloggers;
	
	
	public CategoryManager(ICategoryDao categoryDao, ILoggers[] iloggers) {
		this.iloggers = iloggers;
		this.categoryDao = categoryDao;
	}
	
	public void add(Category category) throws Exception{
		for (Category category1 : categories) {
			if (category1.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		
		for (ILoggers loggers : iloggers) {
			loggers.log(category.getCategoryName());
		}
	}
	
	
}
