package hospital;

import java.util.Scanner;

import hospital.employees.Doctor;
import hospital.employees.Janitor;
import hospital.employees.Nurse;
import hospital.employees.Receptionist;
import hospital.employees.Surgeon;
import hospital.employees.VampireJanitor;

public class Application {

	public static Scanner userInput = new Scanner(System.in);
	public static Hospital highStHospital = new Hospital();
	
	public static void main(String[] args) {
	
		Employee emp1 = new Doctor("1001", "Reed Richards", "Heart");
		Employee emp2 = new Doctor("1002", "Bruce Banner", "Brain");
		Employee emp3 = new Doctor("1003", "Hank McCoy", "Colorectal");
		Employee emp4 = new Surgeon("2001", "Steve Strange", "Plastic");
		Employee emp5 = new Surgeon("2002", "Henry Pym", "Brain");
		Employee emp6 = new Nurse("3001", "Janet VanDyne");
		Employee emp7 = new Nurse("3002", "Scott Summers");
		Employee emp8 = new Nurse("3003", "Sam Guthrie");
		Employee emp9 = new Receptionist("4001", "Gwen Stacy");
		Employee emp10 = new Janitor("5001", "James Howlett");
		Employee emp11 = new VampireJanitor("5002", "Michael Morbius");
		
		highStHospital.addEmployee(emp1);
		highStHospital.addEmployee(emp2);
		highStHospital.addEmployee(emp3);
		highStHospital.addEmployee(emp4);
		highStHospital.addEmployee(emp5);
		highStHospital.addEmployee(emp6);
		highStHospital.addEmployee(emp7);
		highStHospital.addEmployee(emp8);
		highStHospital.addEmployee(emp9);
		highStHospital.addEmployee(emp10);
		highStHospital.addEmployee(emp11);

//		Welcome
		System.out.println("-----------------------------------------------------");
		System.out.println("Welcome to the High Street Hospital Management System");
		System.out.println("-----------------------------------------------------");
		
//		Game Loop
		while (true) {
			System.out.println("");
			System.out.println("Pick an option from the following list:");
			System.out.println("1. Access Employee Records");
			System.out.println("2. Access Patient Records");
			System.out.println("3. Check the current status of the hospital");
			System.out.println("4. Submit work requests to staff");
//			System.out.println("5. Hire a new employee");  // Stretch goal, disabled for now
//			System.out.println("6. Terminate an employee"); // Stretch goal, disabled for now
//			System.out.println("7. Admit a new patient"); // Stretch goal, disabled for now
//			System.out.println("8. Discharge a patient"); // Stretch goal, disabled for now
			System.out.println("9. Exit the system");
		
//			Scanner for user input within this menu.
			String userMenuChoice = userInput.nextLine();
			
			
				switch (userMenuChoice) {
				case "1":
					highStHospital.allEmployeeStatus();
					return;
					
				}
		}

	}

}
