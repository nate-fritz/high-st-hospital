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
	
	@Test
	public void shouldHaveBloodDrawn() {
		underTestPat.haveBloodDrawn();
		int answer = underTestPat.getPatientBlood();
		assertEquals(answer, 10);
	}

	@Test
	public void shouldNotHaveBloodDrawnPastZero() {
		underTestPat.haveBloodDrawn();
		underTestPat.haveBloodDrawn();
		underTestPat.haveBloodDrawn();
		int answer = underTestPat.getPatientBlood();
		assertEquals(answer, 0);
	}

	@Test
	public void shouldReceiveCare() {
		underTestPat.tick();
		underTestPat.receiveCare();
		int answer = underTestPat.getPatientHealth();
		assertEquals(answer, 10);
	}

	@Test
	public void shouldNotReceiveCarePastTen() {

		underTestPat.receiveCare();
		int answer = underTestPat.getPatientHealth();
		assertEquals(answer, 10);
	}
}
