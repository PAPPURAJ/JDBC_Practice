package practice.again;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Student(rs.getString(1),rs.getString(2));
//		System.out.println("Details: "+rowNum);
//		return new Student("Hello","Hi");
	}

}