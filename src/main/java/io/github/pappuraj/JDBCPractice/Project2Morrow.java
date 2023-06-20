package io.github.pappuraj.JDBCPractice;

public class Project2Morrow {
	private String name;
	private String position;
	private String fieldOfWork;
	private double salary;
	public Project2Morrow() {
		super();
	}
	public Project2Morrow(String name, String position, String fieldOfWork, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.fieldOfWork = fieldOfWork;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getFieldOfWork() {
		return fieldOfWork;
	}
	public void setFieldOfWork(String fieldOfWork) {
		this.fieldOfWork = fieldOfWork;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Projec2Morrow [name=" + name + ", position=" + position + ", fieldOfWork=" + fieldOfWork + ", salary="
				+ salary + "]";
	}
	
	

}
