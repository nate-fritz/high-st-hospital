package hospital;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import hospital.employees.Doctor;

public class HospitalTest {

	
	Hospital underTestHospital = new Hospital();
	Employee underTestEmployee = new Doctor("1111", "Dr. Testy", 0, "General");
	Patient underTestPatient = new Patient("9123", "Bob Loblaw");
	
	@Test
	public void shouldAddEmployeeToHospital() {
			underTestHospital.addEmployee(underTestEmployee);
			int answer = underTestHospital.getEmployeesLength();
			assertEquals(answer, 1);
	}
	
	@Test
	public void shouldAddPatientToHospital() {

			underTestHospital.addPatient(underTestPatient);
			int answer = underTestHospital.getPatientsLength();
			assertEquals(answer, 1);
	}
	
	
}
