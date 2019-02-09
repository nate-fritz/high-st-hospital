package hospital.employees;

import hospital.Employee;

public class Janitor extends Employee {

	public Janitor(String empId, String empName, int empSalary, String specialty) {
		super(empId, empName, empSalary, specialty);
		this.isSweeping = true;
	}

	public boolean isSweeping;

	public void sweep() {
	}

	@Override
	public int calcPay() {
		int empSalary = 40000;
		return empSalary;
	}

	@Override
	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]\t" + "\t[ID: " + getEmpId() + "]  \t[Name: "
				+ getEmpName() + "]\t\t[Currently Sweeping: \t" + getIsSweeping()
				+ "]";
	}

	private boolean getIsSweeping() {
		return isSweeping;
	}
	
	public void toggleIsSweeping() {
		isSweeping  = !isSweeping;
		return;
	}
	
	public void tick() {
		toggleIsSweeping();
		return;
	}
	
}
