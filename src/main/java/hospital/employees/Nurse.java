package hospital.employees;

import hospital.Employee;
import hospital.interfaces.CanDrawBlood;
import hospital.interfaces.CanGiveCare;

public class Nurse extends Employee implements CanDrawBlood, CanGiveCare {

	public Nurse(String empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public int calcPay() {
		int empSalary = 50000;
		return empSalary;
	}

	@Override
	public void giveCare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawBlood() {
		// TODO Auto-generated method stub
		
	}

}
