package hospital;

public class Patient {

	private String patientId;
	private String patientName;
	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 10;
	private int patientBlood;
	private static int patientHealth;

	public Patient(String patientId, String patientName, int patintBlood, int patientHealth) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientBlood = BLOOD_LEVEL;
		Patient.patientHealth = HEALTH_LEVEL;
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
		patientBlood += 2;
		
	return;
}


	public static int receiveCare() {
		patientHealth += 10;
		return patientHealth;
		
	}



		
	}
