package practice;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao implements EmpInterface{
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int insert(Employee employee) {
		return template.update("INSERT INTO employee(name,role) VALUES(?,?)",employee.getName(),employee.getRole());
		
	}

}
