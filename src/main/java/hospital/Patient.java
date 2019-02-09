package hospital;

public class Patient {

	public String patientId;
	public String patientName;
	public static final int BLOOD_LEVEL = 20;
	public static final int HEALTH_LEVEL = 10;
	public int patientBlood = BLOOD_LEVEL;
	public int patientHealth = HEALTH_LEVEL;
	
	public String getPatientName() {
		return patientName;
	}
}
