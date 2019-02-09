package hospital.employees;

import hospital.Employee;
import hospital.interfaces.CanDrawBlood;
import hospital.interfaces.CanGiveCare;
import hospital.interfaces.CanOperate;

public class Surgeon extends Employee implements CanDrawBlood, CanGiveCare, CanOperate {

	public Surgeon(String empId, String empName, String specialty) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcPay() {
		int empSalary = 120000;
		return empSalary;
	}

	@Override
	public void toggleIsOperating() {
			this.isOperating = !isOperating;
			
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
