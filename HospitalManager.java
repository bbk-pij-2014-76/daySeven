public class HospitalManager
{
	private Patient patientListStart = null;
	public void launch ()
	{
		Patient patient1 = new Patient("John", 33, "Tuberculosis");
		patientListStart = patient1;
		Patient yetAnotherPatient = new Patient("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		Patient patient3 = new Patient ( "Ali" , 34 , " fever");
		patientListStart.addPatient(patient3);
		Patient patient4 = new Patient ("Shah" , 12 , "flu");
		patientListStart.addPatient(patient4);
		patientListStart.deletePatient(yetAnotherPatient);
	}
	public void printPatientDetails ()
	{
		patientListStart.printPatient(patientListStart);
	}
	public String printPatientCredentials()
	{
		return this.toString();
	}
	public static void main ( String [] args )
	{
		// ...
		HospitalManager hm = new HospitalManager();
		hm.launch();
		hm.printPatientDetails();
	}
}