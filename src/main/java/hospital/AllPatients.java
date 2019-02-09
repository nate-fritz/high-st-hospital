package hospital;

import java.util.Collection;
import java.util.HashMap;

public class AllPatients {

	
		private HashMap<String, Patient> patients = new HashMap<String, Patient>();

		
		public void addPatient(Patient highStHospital) {
			patients.put(highStHospital.getPatientName(), highStHospital);
		}

		public int getPatientsLength() {
			return patients.size();
		}
		
		public Collection<Patient> getPatientList() {
			return patients.values();
		}
	

	

}
