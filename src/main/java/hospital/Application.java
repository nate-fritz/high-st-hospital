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
	public static Hospital highStHospital = new Hospital(100);
	
	public static AllPatients neonatal = new AllPatients();
	public static AllPatients trauma = new AllPatients();
	public static AllPatients anesthesia = new AllPatients();

	public static void main(String[] args) {

		Employee emp1 = new Doctor("1001", "Reed Richards", 0, "Heart");
		Employee emp2 = new Doctor("1002", "Bruce Banner", 0, "Brain");
		Employee emp3 = new Doctor("1003", "Hank McCoy", 0, "Colorectal");
		Employee emp4 = new Surgeon("2001", "Steve Strange", 0, "Plastic");
		Employee emp5 = new Surgeon("2002", "Henry Pym", 0, "Brain");
		Employee emp6 = new Nurse("3001", "Janet VanDyne", 0, "Neonatal", neonatal);
		Employee emp7 = new Nurse("3002", "Scott Summers", 0, "Trauma", trauma);
		Employee emp8 = new Nurse("3003", "Sam Guthrie", 0, "Anesthetist", anesthesia);
		Employee emp9 = new Receptionist("4001", "Gwen Stacy", 0, "N/A");
		Employee emp10 = new Janitor("5001", "James Howlett", 0, "N/A");
		Employee emp11 = new VampireJanitor("5002", "Michael Morbius", 0, "N/A");

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

			while (userMenuChoice != "exit") {
				switch (userMenuChoice) {
				case "1":

					System.out.println("");
					System.out.println("Choose the following options from the Employee Dashboard: \n");
					System.out.println("1. View current status of all employees");
					System.out.println("2. View salaries of all employees");
					System.out.println("3. Return to main menu");
//					Scanner for user input within this sub-menu.	
					String userSubMenuChoice = userInput.nextLine();
					
					switch (userSubMenuChoice) {
					case "1":
						highStHospital.allEmployeeStatus();
						break;
					case "2":
						highStHospital.allEmployeeSalaries();
						break;
					case "3":
						userMenuChoice = "exit";
						break;
					default:
						System.out.println("Please try another option.");
						break;

					}
					break;
					
				case "2":

					System.out.println("");
					System.out.println("Choose the following options from the Patient Dashboard: \n");
					System.out.println("1. View current status of all patients");
					System.out.println("3. Return to main menu");
//					Scanner for user input within this sub-menu.	
					String userSubMenuChoice2 = userInput.nextLine();
					
					switch (userSubMenuChoice2) {
					case "1":
						System.out.println("Option under construction");
						break;
					case "3":
						userMenuChoice = "exit";
						break;
					default:
						System.out.println("Please try another option.");
						break;

					}
					break;
					
				case "3":
					break;
					
				case "4":
					System.out.println("");
					break;
					
				case "9":
					System.out.println("Logging out of system.");
					System.exit(0);
					break;
				}

			}

		}

	}
}