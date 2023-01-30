package in.ineuron.controller;

import in.ineuron.dto.Student;
import in.ineuron.factory.StudentServiceFactory;
import in.ineuron.service.IStudentService;

public class StudentControllerImpl implements IStudentController {
	
	IStudentService stdService;

	@Override
	public String save(Student student) {
		stdService = StudentServiceFactory.getStudentService();
		System.out.println("Implementation class name is: "+stdService.getClass().getName());
		stdService.save(student);
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
