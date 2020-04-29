package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		System.out.println("=== TEST1: seller findById");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("=== TEST2: seller findByDepartment");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		
		System.out.println("=== TEST3: seller findAll");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
