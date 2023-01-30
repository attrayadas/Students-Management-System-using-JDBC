package in.ineuron.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import in.ineuron.dto.Student;
import in.ineuron.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {
	
	Connection connection=null;

	@Override
	public String save(Student student) {
		try {
			Connection connection = JdbcUtil.getJdbcConnection();
			System.out.println("Implementation class object is: "+connection.getClass().getName());
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student findById(Integer sid) {
		return null;
	}

	@Override
	public String updateById(Integer sid) {
		return null;
	}

	@Override
	public String deleteById(Integer sid) {
		return null;
	}

}
