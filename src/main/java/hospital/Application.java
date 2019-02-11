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

	public static void main(String[] args) {

//		Add pre-built employees 
		Doctor doc1 = new Doctor("1001", "Reed Richards", 0, "Heart");
		Doctor doc2 = new Doctor("1002", "Bruce Banner", 0, "Brain");
		Doctor doc3 = new Doctor("1003", "Hank McCoy", 0, "Colorectal");
		Surgeon surg1 = new Surgeon("2001", "Steve Strange", 0, "Plastic");
		Surgeon surg2 = new Surgeon("2002", "Henry Pym", 0, "Brain");
		Nurse nurse1 = new Nurse("3001", "Janet VanDyne", 0, "Neonatal");
		Nurse nurse2 = new Nurse("3002", "Scott Summers", 0, "Anesthesia");
		Nurse nurse3 = new Nurse("3003", "Sam Guthrie", 0, "Trauma");
		Receptionist recep1 = new Receptionist("4001", "Gwen Stacy", 0, "N/A");
		Janitor jani1 = new Janitor("5001", "James Howlett", 0, "N/A");
		VampireJanitor jani2 = new VampireJanitor("5002", "Michael Morbius", 0, "N/A");

		highStHospital.addEmployee(doc1);
		highStHospital.addEmployee(doc2);
		highStHospital.addEmployee(doc3);
		highStHospital.addEmployee(surg1);
		highStHospital.addEmployee(surg2);
		highStHospital.addEmployee(nurse1);
		highStHospital.addEmployee(nurse2);
		highStHospital.addEmployee(nurse3);
		highStHospital.addEmployee(recep1);
		highStHospital.addEmployee(jani1);
		highStHospital.addEmployee(jani2);

//		Add pre-built patients
		Patient patient1 = new Patient("9999", "John Doe");
		Patient patient2 = new Patient("9988", "Jane Doe");
		Patient patient3 = new Patient("9977", "Jim Doe");
		Patient patient4 = new Patient("9966", "Jenn Doe");
		Patient patient5 = new Patient("9955", "Jack Doe");
		Patient patient6 = new Patient("9944", "Jill Doe");

		highStHospital.addPatient(patient1);
		highStHospital.addPatient(patient2);
		highStHospital.addPatient(patient3);
		highStHospital.addPatient(patient4);
		highStHospital.addPatient(patient5);
		highStHospital.addPatient(patient6);
		nurse1.addNursePatient(patient1);
		nurse1.addNursePatient(patient2);
		nurse2.addNursePatient(patient3);
		nurse2.addNursePatient(patient4);
		nurse3.addNursePatient(patient5);
		nurse3.addNursePatient(patient5);

//		Welcome
		System.out.println("-----------------------------------------------------");
		System.out.println("Welcome to the High Street Hospital Management System");
		System.out.println("-----------------------------------------------------");

//		Game Loop
		boolean mainMenu = true;
		while (mainMenu) {

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
			String userMainMenuChoice = userInput.nextLine();

			switch (userMainMenuChoice) {
			case "1":
				boolean employeeMenu = true;
				while (employeeMenu) {
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
						employeeMenu = false;
						break;
					default:
						System.out.println("Please try another option.");
						break;

					}

				}
				break;
			case "2":
				boolean patientMenu = true;
				while (patientMenu) {
					System.out.println("");
					System.out.println("Choose the following options from the Patient Dashboard: \n");
					System.out.println("1. View current status of all patients");
					System.out.println("3. Return to main menu");
//					Scanner for user input within this sub-menu.	
					String userSubMenuChoice = userInput.nextLine();

					switch (userSubMenuChoice) {
					case "1":
						highStHospital.allPatientStatus();
						break;
					case "3":
						patientMenu = false;
						break;
					default:
						System.out.println("Please try another option.");
						break;

					}

				}
				break;

			case "3":
				System.out.println("Current status of hospital: " + highStHospital.getHospitalCleanliness()+ "%");
				highStHospital.cleanlinessWarning();
				highStHospital.tick();
				break;

			case "4":
				boolean assignmentMenu = true;

				while (assignmentMenu) {

					System.out.println("Employee Dashboard - Assign Duties\n");
					System.out.println("1. Assign all doctors on their rounds to care for patients");
					System.out.println("2. Assign all surgeons into the operating room");
					System.out.println("3. Assign all nurses to draw blood from patients");
					System.out.println("4. Assign all janitors to sweep the floors");
					System.out.println("5. Assign all receptionists to answer the phones.");
					System.out.println("9. Return to main menu.");
					String userSubMenuChoice2 = userInput.nextLine();
					switch (userSubMenuChoice2) {
					case "1":
						highStHospital.giveCareAll();
						System.out.println("\nAll doctors start making their rounds, and the health of the patients improves.\n");
						break;
					case "2":
						highStHospital.operatingAll();
						System.out.println("\nAll of the surgeons report to the operating room.  Patient health improves, but some blood got all over the floors.\n");
						break;
					case "3":
						highStHospital.drawBloodAll();
						System.out.println("\nThe nurses go about the hospital, drawing blood from patients.");
						break;
					case "4":
						highStHospital.sweepFloorsAll();
						System.out.println("\nThe janitors go about the hospital cleaning.  The place is starting to look much cleaner!\n");
						break;
					case "5":
						break;
					case "9":
						assignmentMenu = false;
						break;

					}
					highStHospital.tick();

				}
				break;
			case "9":
				System.out.println("Logging out of system.");
				mainMenu = false;
				System.exit(0);
				break;

			}

		}

	}
}
