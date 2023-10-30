package dao;

import dao.impl.DepartmentDaoJDBC;
import dao.impl.SellerDaoJDBC;
import db.DB;

/*Classe que gera varios DAOs para a implementação do banco de dados*/
public class DaoFactory {
	
	public static SellerDao createSellerDao() { 
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() { 
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
