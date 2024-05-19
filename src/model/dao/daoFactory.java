package model.dao;

import model.dao.impl.SellerDaoJdbc;

public class daoFactory {
	public static sellerDao createSellerDao() {
		return new SellerDaoJdbc();
	} 

}
