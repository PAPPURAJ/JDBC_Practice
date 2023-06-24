package practice.again;

public class Student {
	private String name;
	private String district;
	public Student() {
		super();
	}
	public Student(String name, String district) {
		super();
		this.name = name;
		this.district = district;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", district=" + district + "]";
	}
	
	
}
