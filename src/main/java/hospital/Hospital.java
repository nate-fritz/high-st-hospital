package hospital;

import java.util.Collection;
import java.util.HashMap;

import hospital.employees.Doctor;
import hospital.employees.Surgeon;

public class Hospital {

	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();

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
		return employees.size();
	}

	public Employee getEmployee(String empId) {
		return employees.get(empId);
	}

	public Collection<Employee> getEmployee() {
		return employees.values();
	}

	public void allEmployeeStatus() {
		System.out.println(" ___________________________________________________________________________");
		System.out.println("|  ID  |        Name   \t |  Salary  | On Phone? | Operating? |   Sweeping?  |");
		System.out.println("|———————————————————————————————————————————————————————————————————————————|");
		for (Employee employee : employees.values()) {
			if (employee instanceof Doctor) {
				System.out.println("| " + (((Doctor) employee).getEmpId()) + " | " + ((Doctor) employee).getEmpName()
						+ "\t |  $" + ((Doctor) employee).calcPay() + "  |   " + ((Doctor) employee).getIsOnPhone()
						+ "\t|" + "     N/A    |" + "     N/A \t    |"
						+ "\n|———————————————————————————————————————————————————————————————————————————|");
			} else {
				if (employee instanceof Surgeon) {
					System.out.println("| " + (((Surgeon) employee).getEmpId()) + " | "
							+ ((Surgeon) employee).getEmpName() + "\t | $" + ((Surgeon) employee).calcPay() + "  |   "
							+ " N/A \t|    " + ((Surgeon) employee).getIsOperating() + "   |" + "     N/A \t    |"
							+ "\n|———————————————————————————————————————————————————————————————————————————|");

				}
			}
		}
	}
}