package in.ineuron.service;

import in.ineuron.dao.IStudentDao;
import in.ineuron.dto.Student;
import in.ineuron.factory.StudentDaoFactory;

public class StudentServiceImpl implements IStudentService {
	
	IStudentDao studentDao;

	@Override
	public String save(Student student) {
		studentDao = StudentDaoFactory.getStudentDao();
		System.out.println("Implementation class name is :"+studentDao.getClass().getName());
		studentDao.save(student);
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
