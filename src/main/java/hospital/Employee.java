package hospital;

public abstract class Employee {

	private String employeeId;
	private String empName;
	private int empSalary;
	private String specialty;
	private boolean isOperating;
	public boolean isSweeping;

	public Employee(String empId, String empName, int empSalary, String specialty) {
		this.employeeId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.specialty = specialty;
		this.isOperating = false;

	}

	public abstract int calculatePay();

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return employeeId;
	}

	public int getSalary() {
		return empSalary;
	}

	public void giveCare(Patient patient) {
		patient.receiveCare();
		return;
	}
	


	public String getSpecialty() {
		return specialty;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]\t" + "\t[ID: " + employeeId + "]  \t[Name: " + empName + "]";
	}

	public String displaySalary() {
		return "[ID: " + employeeId + "]  \t[Name: " + empName + "]\t \t[Salary: $" + calculatePay() + "]";
	}

	public void tick() {
		return;
	}


}
