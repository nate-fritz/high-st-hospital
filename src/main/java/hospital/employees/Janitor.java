package hospital.employees;

import hospital.Employee;

public class Janitor extends Employee {

	public Janitor(String empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	public void sweep() {
	}

	@Override
	public int calcPay() {
		int empSalary = 40000;
		return empSalary;
	}

}
