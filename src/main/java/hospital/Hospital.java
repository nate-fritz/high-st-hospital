package hospital;


import java.util.HashMap;

public class Hospital {

	private HashMap<String, Employee> employees = new HashMap<String, Employee>();


	
	public void addEmployee(Employee highStHospital) {
		employees.put(highStHospital.getEmpName(), highStHospital);
	}

	public int getEmployeesLength() {
		return employees.size();
	}



	public void allEmployeeStatus() {
		System.out.println("Employee Dashboard - Current Status \n");
		for (Employee employee : employees.values()) {
			if (employee instanceof Employee) {
				System.out.println(employee.toString());
				employee.tick();
			}
		}
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