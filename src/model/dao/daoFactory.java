package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJdbc;

public class daoFactory {//sellerDao é interface
	public static sellerDao createSellerDao() {
		return new SellerDaoJdbc(DB.getConnection());
		//retorna SellerDaoJdbc já IMPLEMENTADA!
	} 

}
