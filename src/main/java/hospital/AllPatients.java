package hospital;

import java.util.Collection;
import java.util.HashMap;

public class AllPatients {

	
	public static HashMap<String, Patient> patients = new HashMap<String, Patient>();

		

		
		public Collection<Patient> getPatientList() {
			return patients.values();
		}
	
		public void addPatient(Patient highStHospital) {
			patients.put(highStHospital.getPatientName(), highStHospital);
		}

		public int getPatientsLength() {
			return patients.size();
		}
	

}
