package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class FactoryDao {
	
	public static SellerDaoJDBC createSellerDao() {
		return new SellerDaoJDBC(); 
	}

}
