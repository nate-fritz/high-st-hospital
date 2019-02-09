package hospital;

public abstract class Employee {

	public String empId;
	public String empName;
	public int empSalary;
	public boolean isOnPhone;
	public boolean isOperating;
	public String specialty;
	
	public Employee(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		this.isOnPhone = false;
		this.isOperating = false;
		
	}
	
	public abstract int calcPay();

	public String getEmpName() {
		return empName;
	}
	
	public String getEmpId() {
		return empId;
	}

	public boolean getIsOnPhone() {
		return isOnPhone;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	}
	

	

