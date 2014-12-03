public class HospitalManager {
			private Patient patientListStart = null;
			public void launch ( ) {
				Patient firstPatient = new Patient("John", 33, "Tuberculosis");
				patientListStart = firstPatient;
			}

		public static void main ( String [] args ) {
				// ...
				HospitalManager hm = new HospitalManager();
				hm.launch();

				Patient yetAnotherPatient = new Patient("Mary", 66, "Meningitis");



		}
}