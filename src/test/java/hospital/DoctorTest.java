package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hospital.employees.Doctor;

public class DoctorTest {


		Employee underTestDoc = new Doctor("1001", "Test Doc", 0, "Heart");
		Patient underTestPat = new Patient("9999", "Jane Doe", 10, 10);
		
		@Test
		public void shouldIncreaseHealth() {

			underTestDoc.giveCare();
			int answer  = underTestPat.getPatientHealth();	
			assertEquals(answer, 20);

		}
	

}
