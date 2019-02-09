package hospital;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import hospital.employees.Doctor;

public class HospitalTest {

	
	Hospital underTestHospital = new Hospital();
	Employee underTestEmployee = new Doctor("1111", "Dr. Testy");
	
	
	@Test
	public void shouldAddEmployeeToHospital() {
			underTestHospital.addEmployee(underTestEmployee);
			int answer = underTestHospital.getEmployeesLength();
			assertEquals(answer, 1);
	}
			
}
