package hospital.employees;

import hospital.Employee;
import hospital.interfaces.TakesPhoneCalls;

public class Receptionist extends Employee implements TakesPhoneCalls {

	public Receptionist(String empId, String empName, int empSalary, String specialty) {
		super(empId, empName, empSalary, specialty);
	}

	private boolean isOnPhone = TakesPhoneCalls.IS_ON_PHONE;

	@Override
	public int calculatePay() {
		int empSalary = 45000;
		return empSalary;
	}

	@Override
	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]" + "\t[Specialty: " + getSpecialty() + "]\t" + "\t[ID: "
				+ getEmpId() + "]  \t[Name: " + getEmpName() + "]\t\t[Currently On Phone: \t" + getIsOnPhone() + "]";
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
