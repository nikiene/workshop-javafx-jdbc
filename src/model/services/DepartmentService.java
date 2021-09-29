package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
	
		DepartmentDao dao = DaoFactory.createDepartmentDao();
		
		/*
		 * mock
		 * List<Department> list = new ArrayList<>();
		 * list.add(new Department(1, "Books"));
		 * list.add(new Department(2, "Computers"));
		 * list.add(new Department(3, "Electronics"));
		 * return list;
		 */
		
		return dao.findAll();
	}
}
