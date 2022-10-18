package dataAccess;

import entities.Category;

public class JDBCCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanına eklendi : " + category.getCategoryName());
		
	}

}
