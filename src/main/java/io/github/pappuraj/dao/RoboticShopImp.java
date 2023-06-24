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

	public RoboticProduct searchById(int id) {
		return myJDBCtemp.queryForObject("SELECT * from "+tableName+" WHERE Id=?", new MyRowMapper(),id);
	}

	public RoboticProduct searchByModel(String model) {
		return myJDBCtemp.queryForObject("SELECT * from "+tableName+" WHERE model=?", new MyRowMapper(),model);
	}

	public List<RoboticProduct> searchByname(String name) {
		return myJDBCtemp.query("SELECT * from "+tableName+ " WHERE name=?",new MyRowMapper(),name);
	}

	public List<RoboticProduct> searchByCategory(String category) {
		return myJDBCtemp.query("SELECT * from "+tableName+ " WHERE category=?",new MyRowMapper(),category);
	}

	public List<RoboticProduct> searchByPriceRange(double starting, double ending) {
		return myJDBCtemp.query("SELECT * from "+tableName+ " WHERE price BETWEEN ? AND ?",new MyRowMapper(),starting,ending);
	}

}
