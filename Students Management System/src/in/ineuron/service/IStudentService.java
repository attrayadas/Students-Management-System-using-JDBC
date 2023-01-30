package in.ineuron.service;

import in.ineuron.dto.Student;

public interface IStudentService {
	String save(Student student); //Creating a record

	Student findById(Integer sid); //Reading a record
	
	String updateById(Integer sid); //Updating a record

	String deleteById(Integer sid); //Deleting a record
}
