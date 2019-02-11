package hospital;

public class Patient {

	private String patientId;
	private String patientName;
	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 10;
	private int patientBlood;
	private int patientHealth;

	public Patient(String patientId, String patientName) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientBlood = BLOOD_LEVEL;
		this.patientHealth = HEALTH_LEVEL;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	public int getPatientBlood() {
		return patientBlood;
	}

	public int getPatientHealth() {
		return patientHealth;
	}

	public void tick() {
		patientHealth -= 1;
		patientBlood += 8;
		if (patientHealth <= 0)
			patientHealth = 0;
		if (patientBlood >= 20)
			patientBlood = 20;
		return;
	}

	public int receiveCare() {
		getPatientHealth();
		if (patientHealth >= 10)
			System.out.println("This patient does not require additional care right now.");
		else
			patientHealth += 5;
		if (patientHealth >= 10)
			patientHealth = 10;

		return patientHealth;

	}

	public int haveBloodDrawn() {
		getPatientBlood();
		if (patientBlood <= 0)
			System.out.println("This patient cannot have blood drawn at this time.");
		else
			patientBlood -= 10;
		if (patientBlood <= 0)
			patientBlood = 0;

		return patientBlood;
	}

	public int getHealthConstant() {
		return HEALTH_LEVEL;
	}

	public int getBloodConstant() {
		return BLOOD_LEVEL;
	}

	public String toString() {
		return patientName;

	}

}
