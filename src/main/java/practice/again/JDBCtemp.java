package practice.again;

import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCtemp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	
	
	public JDBCtemp() {
		super();
	}



	public JDBCtemp(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int write(Student student) {
		return jdbcTemplate.update("INSERT INTO empdetails(name,address) VALUES (?,?)",student.getName(),student.getDistrict());
		
	}

}
