package in.ineuron.main;

import in.ineuron.controller.IStudentController;
import in.ineuron.factory.StudentControllerFactory;

public class TestApp {

	public static void main(String[] args) {
		IStudentController studentController = StudentControllerFactory.getStudentController();
		System.out.println("Imlementation class name is: "+studentController.getClass().getName());
		studentController.save(null);
	}

}