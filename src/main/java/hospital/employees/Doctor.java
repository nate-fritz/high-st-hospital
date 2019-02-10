package hospital.employees;

import hospital.Employee;
import hospital.Patient;
import hospital.interfaces.CanDrawBlood;
import hospital.interfaces.CanGiveCare;
import hospital.interfaces.TakesPhoneCalls;

public class Doctor extends Employee implements CanDrawBlood, CanGiveCare, TakesPhoneCalls {

	public Doctor(String empId, String empName, int empSalary, String specialty) {
		super(empId, empName, empSalary, specialty);
	}

	private boolean isOnPhone = TakesPhoneCalls.IS_ON_PHONE;

	@Override
	public int calcPay() {
		int empSalary = 90000;
		return empSalary;

	}

	@Override
	public void drawBlood() {
		// TODO Auto-generated method stub

	}

	@Override
	public void giveCare() {
		Patient.receiveCare();

	}

	@Override
	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]\t" + "\t[ID: " + getEmpId() + "]  \t[Name: "
				+ getEmpName() + "]\t\t[Currently On Phone: \t" + getIsOnPhone()
				+ "]";
	}

	@Override
	public void toggleIsOnPhone() {
		isOnPhone = !isOnPhone;

	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}
	
	public void tick() {
		toggleIsOnPhone();
		return;
	}
	


}
