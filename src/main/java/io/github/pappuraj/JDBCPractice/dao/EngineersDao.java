package io.github.pappuraj.JDBCPractice.dao;
import org.springframework.jdbc.core.JdbcTemplate;
import io.github.pappuraj.JDBCPractice.entities.Project2Morrow;

public class EngineersDao implements EngineerDaoInterface {

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Project2Morrow engineer) {
		String query = "INSERT INTO engineers(name,position,fieldOfWork,salary) VALUES(?,?,?,?)";
		return jdbcTemplate.update(query,engineer.getName(),engineer.getPosition(),engineer.getFieldOfWork(),engineer.getSalary());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	


	

}
