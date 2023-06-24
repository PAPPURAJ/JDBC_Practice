package io.github.pappuraj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import io.github.pappuraj.model.RoboticProduct;

public class RoboticShopImp implements RoboticShopDao{
	
	JdbcTemplate myJDBCtemp;
	private String tableName="Product";
	
	
	
	public RoboticShopImp() {
		super();
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
		return myJDBCtemp.update("INSERT INTO "+tableName+"(name,model,category,price) values (?,?,?,?)",product.getName(),product.getModel(),product.getCategory(),product.getPrice());
	}
	
	public List<RoboticProduct> viewAllProduct() {
		return myJDBCtemp.query("SELECT * from "+tableName,new MyRowMapper());
	}

	public int updateProduct(RoboticProduct product) {
		return myJDBCtemp.update("UPDATE "+tableName+" SET name=?, model=?, category=?, price=? WHERE Id=?",product.getName(),product.getModel(),product.getCategory(),product.getPrice(),product.getId());
	}

	public int deleteProduct(int id) {
		return myJDBCtemp.update("DELETE FROM "+tableName+" WHERE Id=?",id);
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
