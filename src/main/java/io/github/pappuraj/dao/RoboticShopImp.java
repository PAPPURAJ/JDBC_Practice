package io.github.pappuraj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import io.github.pappuraj.model.RoboticProduct;

public class RoboticShopImp implements RoboticShopDao{
	
	JdbcTemplate myJDBCtemp;
	
	
	
	public RoboticShopImp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public RoboticShopImp(JdbcTemplate myJDBCtemp) {
		super();
		this.myJDBCtemp = myJDBCtemp;
	}
	
	

	public JdbcTemplate getMyJDBCtemp() {
		return myJDBCtemp;
	}



	public void setMyJDBCtemp(JdbcTemplate myJDBCtemp) {
		this.myJDBCtemp = myJDBCtemp;
	}



	public int insertProduct(RoboticProduct product) {

		return 0;
	}

	public int updateProduct(RoboticProduct product) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public RoboticProduct serarchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public RoboticProduct serarchByModel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RoboticProduct> searchByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RoboticProduct> searchByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RoboticProduct> searchByPriceRange(double starting, double ending) {
		// TODO Auto-generated method stub
		return null;
	}

}
