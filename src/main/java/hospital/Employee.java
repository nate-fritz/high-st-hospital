package hospital;

public abstract class Employee {

	private String empId;
	private String empName;
	private int empSalary;
	private String specialty;
	private boolean isOperating;

	public Employee(String empId, String empName, int empSalary, String specialty) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.specialty = specialty;
		this.isOperating = false;

	}

	public abstract int calcPay();

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public int getSalary() {
		return empSalary;
	}

	public String getSpecialty() {
		return specialty;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	public String toString() {
		return "[Job: " + this.getClass().getSimpleName() + "]\t" + "\t[ID: " + empId + "]  \t[Name: " + empName
				+ "]";
	}
	
	public String displaySalary() {
		return "[ID: " + empId + "]  \t[Name: " + empName  + "]\t \t[Salary: $" + calcPay() + "]";
	}
	
	public void tick() {
		return;
	}
}
