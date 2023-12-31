package io.github.pappuraj.dao;

import java.util.List;

import io.github.pappuraj.model.RoboticProduct;

public interface RoboticShopDao {
	int insertProduct(RoboticProduct product);
	List<RoboticProduct> viewAllProduct();
	int updateProduct(RoboticProduct product);
	int deleteProduct(int id); 
	RoboticProduct searchById(int id);
	RoboticProduct searchByModel(String model);
	List<RoboticProduct> searchByname(String name);
	List<RoboticProduct> searchByCategory(String category);
	List<RoboticProduct> searchByPriceRange(double starting,double ending);
}
