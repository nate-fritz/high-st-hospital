package hospital.employees;

import hospital.interfaces.CanDrawBlood;
import hospital.interfaces.CanGiveCare;
import hospital.interfaces.CanOperate;


public class Surgeon extends Doctor implements CanDrawBlood, CanGiveCare, CanOperate {

	public String specialty;


	public Surgeon(String empId, String empName, int empSalary, String specialty) {
		super(empId, empName, empSalary, specialty);
		this.specialty = specialty;

	}
	
	private boolean isOperating = CanOperate.IS_OPERATING;

	@Override
	public int calcPay() {
		int empSalary = 120000;
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

	@Override
	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]\t" + "\t[ID: " + getEmpId() + "]  \t[Name: "
				+ getEmpName() + "]\t\t[Currently Operating: \t" + getIsOperating()
				+ "]";
	}
	@Override
	public void toggleIsOperating() {
		isOperating = !isOperating;

	}

	public boolean getIsOperating() {
		return isOperating;
	}
	
	public void tick() {
		toggleIsOperating();
		return;
	}


}
