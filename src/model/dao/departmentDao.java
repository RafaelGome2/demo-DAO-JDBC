package model.dao;

import java.util.List;

import model.entities.Department;

public interface departmentDao {
	void insert(Department obj);
	void update(Department obj);
	void deletebyId(Integer id);
	Department findById(Integer id);
	 List<Department> findAll();
	 
	
	

}
