package hospital.employees;

import hospital.Employee;
import hospital.interfaces.CanDrawBlood;
import hospital.interfaces.CanGiveCare;
import hospital.interfaces.TakesPhoneCalls;

public class Doctor extends Employee implements CanDrawBlood, CanGiveCare, TakesPhoneCalls{


	
	public Doctor(String empId, String empName, String specialty) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public int calcPay() {
		int empSalary = 90000;
		return empSalary;
		
	}
	

	public int getEmpSalary() {
		return empSalary;
	}

	@Override
	public void drawBlood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giveCare() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void toggleIsOnPhone() {
		this.isOnPhone = !isOnPhone;
		
		
		
	}

}
