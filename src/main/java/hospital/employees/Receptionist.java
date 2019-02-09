package hospital.employees;

import hospital.Employee;
import hospital.interfaces.TakesPhoneCalls;

public class Receptionist extends Employee implements TakesPhoneCalls {

	public Receptionist(String empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcPay() {
		int empSalary = 45000;
		return empSalary;
	}

	@Override
	public void toggleIsOnPhone() {
		// TODO Auto-generated method stub
		
	}

}
