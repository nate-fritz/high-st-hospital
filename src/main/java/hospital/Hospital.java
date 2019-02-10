package hospital;

import java.util.HashMap;

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

}