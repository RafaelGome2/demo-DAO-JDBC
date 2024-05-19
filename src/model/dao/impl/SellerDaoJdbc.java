package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import model.dao.sellerDao;
import model.entities.Department;
import model.entities.Seller;
//nesta classe ocorre a implementaçao da interface sellerDao
public class SellerDaoJdbc implements sellerDao {

	private Connection conn;
	public SellerDaoJdbc (Connection conn) {
		this.conn= conn;
	}
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletebyId(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement ps =null;
		ResultSet rs= null;
		try { ps = conn.prepareStatement("SELECT seller.*,department.Name as DepName  \r\n"
				+ "FROM seller INNER JOIN department  \r\n"
				+ "ON seller.DepartmentId = department.Id  \r\n"
				+ "WHERE seller.Id = ?");
		ps.setInt(1, id);
		rs = ps.executeQuery();
		if(rs.next()) {
			Department dep = new Department();
			dep.setId(rs.getInt(6));//departmentId = coluna 6
			dep.setName(rs.getString(7));
			Seller obj = new Seller();
			obj.setId(rs.getInt(1));
			obj.setName(rs.getString(2));
			obj.setEmail(rs.getString(3));
			obj.setBirthDate(rs.getDate(4));
			obj.setBaseSalary(rs.getDouble(5));
			obj.setDepartment(dep);
			return obj;
		}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
		return null;
		
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
