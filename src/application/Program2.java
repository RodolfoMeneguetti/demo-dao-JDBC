package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: Department Insert===");
		Department newDepartment = new Department(null,"GREG");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted Date is: " +  newDepartment.getName() + ", New id = " + newDepartment.getId());
		System.out.println("Finality program");
		

	}

}
