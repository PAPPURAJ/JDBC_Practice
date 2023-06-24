package practice.again;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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



	public int updateAddress(Student student) {
		return jdbcTemplate.update("UPDATE empdetails SET address=? WHERE name=?",student.getDistrict(),student.getName());
	}



	public int delete(Student student) {
		return jdbcTemplate.update("DELETE FROM empdetails WHERE name=? AND address=?",student.getName(),student.getDistrict());

	}



	public Student select(String name) {
		
		RowMapper<Student> rm=new MyRowMapper();
		
		return jdbcTemplate.queryForObject("SELECT * FROM empdetails WHERE name=?", rm, name);
	}



	public List<Student> selectAll() {
		
		return jdbcTemplate.query("SELECT * FROM empdetails", new MyRowMapper());
	}
	
	public List<Student> selectAll(String name) {
		
		return jdbcTemplate.query("SELECT * FROM empdetails WHERE name=?", new MyRowMapper(),name);
	}

	
	


}
