package hospital.employees;

import hospital.interfaces.CanDrawBlood;

public class VampireJanitor extends Janitor implements CanDrawBlood {

	public VampireJanitor(String empId, String empName, int empSalary, String specialty) {
		super(empId, empName, empSalary, specialty);
		this.isSweeping = true;
	}

	public boolean isSweeping;


	@Override
	public void drawBlood() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]" + "\t[Specialty: " + getSpecialty() + "]\t" + "\t[ID: " + getEmpId() + "]  \t[Name: " + getEmpName()
				+ "]\t\t[Currently Sweeping: \t" + getIsSweeping() + "]";
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
