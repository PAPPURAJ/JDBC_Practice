package practice.again;

import java.util.List;

public interface StudentDao {
	int write(Student student);
	int updateAddress(Student student);
	int delete(Student student);
	Student select(String name);
	List<Student> selectAll();
	List<Student> selectAll(String name);

}
