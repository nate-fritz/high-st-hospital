package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientTest {

	Patient underTestPat = new Patient("9999", "Jane Doe");
	
	@Test
	public void healthShouldDecreaseOnTick() {
		underTestPat.tick();
		int answer = underTestPat.getPatientHealth();
		assertEquals(answer, 9);
		
		
	}
	
	@Test
	public void bloodShouldIncreaseOnTick() {
		underTestPat.tick();
		int answer = underTestPat.getPatientBlood();
		assertEquals(answer, 22);
		
		
	}


}
