package app;

import java.sql.Connection;

import model.dao.daoFactory;
import model.dao.sellerDao;
import model.dao.impl.SellerDaoJdbc;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//sellerDao sellerDao= daoFactory.createSellerDao();
		sellerDao sellerdao= daoFactory.createSellerDao();
		Seller obj = sellerdao.findById(3);
		System.out.println(obj);

	}

}
