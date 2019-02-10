package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hospital.employees.Doctor;

public class DoctorTest {


		Employee underTestDoc = new Doctor("1001", "Test Doc", 0, "Heart");
		Patient underTestPat = new Patient("9999", "Jane Doe");
		
		
		@Test
		public void shouldIncreaseHealth() {
			underTestPat.tick();
			int answerBefore  = underTestPat.getPatientHealth();	
			underTestDoc.giveCare(underTestPat);
			int answerAfter = underTestPat.getPatientHealth();
			assertEquals(answerBefore + 10, answerAfter);

		}
	

}
