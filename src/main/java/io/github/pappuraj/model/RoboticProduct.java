package io.github.pappuraj.model;

public class RoboticProduct {
	private int Id;
	private String name;
	private String model;
	private String category;
	private String price;
	
	public RoboticProduct() {
		super();
	}
	public RoboticProduct(int id, String name, String model, String category, String price) {
		super();
		Id = id;
		this.name = name;
		this.model = model;
		this.category = category;
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "RoboticProduct [Id=" + Id + ", name=" + name + ", model=" + model + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
	
	

}
