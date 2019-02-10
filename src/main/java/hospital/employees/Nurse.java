package hospital.employees;



import java.util.HashMap;

import hospital.AllPatients;
import hospital.Employee;
import hospital.Patient;
import hospital.interfaces.CanDrawBlood;
import hospital.interfaces.CanGiveCare;

public class Nurse extends Employee implements CanDrawBlood, CanGiveCare {



	public Nurse(String empId, String empName, int empSalary, String specialty, AllPatients patients) {
		super(empId, empName, empSalary, specialty);
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
	
	public HashMap<String,Patient> getAllPatients() {
	
		return AllPatients.patients;
	}
	@Override
	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]\t" +  "\t[ID: " + getEmpId() + "]  \t[Name: " + getEmpName() + "]" + "\t[Patients: " + getAllPatients();
	}
	

}
