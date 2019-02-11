package hospital;

import java.util.HashMap;

import hospital.employees.Janitor;
import hospital.employees.Receptionist;
import hospital.employees.Surgeon;
import hospital.employees.VampireJanitor;

public class Hospital {

	private int hospitalCleanliness;

	public Hospital(int hospitalCleanliness) {
		this.hospitalCleanliness = hospitalCleanliness;
	}

	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();

	public int getHospitalCleanliness() {
		return hospitalCleanliness;
	}

	public void addEmployee(Employee highStHospital) {
		employees.put(highStHospital.getEmpName(), highStHospital);
	}

	public int getEmployeesLength() {
		return employees.size();
	}

	public void addPatient(Patient highStHospital) {
		patients.put(highStHospital.getPatientName(), highStHospital);
	}

	public int getPatientsLength() {
		return patients.size();
	}

	public void giveCareAll() {
		for (Patient patient : patients.values()) {
			patient.receiveCare();
			patient.tick();
		}
	}

	public void drawBloodAll() {
		for (Patient patient : patients.values()) {
			patient.haveBloodDrawn();
		}
	}

	public void sweepFloorsAll() {
		for (Employee employee : employees.values()) {
			if (employee instanceof Janitor) {
				((Janitor) employee).sweep();
				hospitalCleanliness = 100;
				employee.isSweeping = true;
				if (employee instanceof VampireJanitor) {
					drawBloodAll();
					tick();

					System.out.println("\nA patient's blood level mysteriously dropped..\n");
				}
			}
		}
	}

	public void takeCallsAll() {
		for (Employee employee : employees.values()) {
			if (employee instanceof Receptionist) {
				((Receptionist) employee).toggleIsOnPhone();
				tick();
			}
		}
	}

	public void operatingAll() {
		for (Employee employee : employees.values()) {
			if (employee instanceof Surgeon) {
				((Surgeon) employee).toggleIsOperating();
				hospitalCleanliness -= 10;
				for (Patient patient : patients.values()) {
					patient.haveBloodDrawn();
					patient.receiveCare();
					patient.tick();
				}
				tick();
			}
		}
	}

	public void tick() {
		hospitalCleanliness -= 15;
		if (hospitalCleanliness <= 0)
			hospitalCleanliness = 0;
		return;
	}

	public void allEmployeeStatus() {
		System.out.println("Employee Dashboard - Current Status \n");
		for (Employee employee : employees.values()) {
			if (employee instanceof Employee) {
				System.out.println(employee.toString());
				employee.tick();
			}
		}
		tick();
		getHospitalCleanliness();
		System.out.println("Hospital cleanliness: " + getHospitalCleanliness() + "%");
	}

	public void allEmployeeSalaries() {
		System.out.println("Employee Dashboard - Salaries \n");
		for (Employee employee : employees.values()) {
			if (employee instanceof Employee) {
				System.out.println(employee.displaySalary());

			}
		}
	}

	public void allPatientStatus() {
		System.out.println("Patient Dashboard - Current Status;\n");
		for (Patient patient : patients.values()) {
			System.out.println("[ID: " + patient.getPatientId() + "]  \t[Name: " + patient.getPatientName()
					+ "] \t[Vitals: " + patient.getPatientHealth() + "/" + patient.getHealthConstant()
					+ "]\t\t [Blood: " + patient.getPatientBlood() + "/" + patient.getBloodConstant() + "]");
			patient.tick();
		}
	}

	public void employeeNameList() {
		for (Employee employee : employees.values()) {
			if (employee instanceof Employee)
				System.out.println("[" + employee.getEmpId() + "] \t [" + employee.getEmpName() + "]    \t" + "[Job: "
						+ employee.getClass().getSimpleName() + "]");

		}
		return;
	}

	public Employee getEmployee(String employeeId) {
		return employees.get(employeeId);
	}

	public void cleanlinessWarning() {
		if (hospitalCleanliness <= 30)
			System.out.println(
					"Warning:  The hospital is falling below acceptable sanitary conditions.  Please address immediately.");
	}
}