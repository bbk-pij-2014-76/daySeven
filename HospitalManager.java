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
		Patient patient5 = new Patient ("Sarah" , 30 , "Stomach pain");
		patientListStart.addPatient(patient5);
		patientListStart.removeFirstPatient();
	}
	public void printPatientDetails ()
	{
		patientListStart.printPatient(patientListStart);
	}
	public void printPatientCount()
	{
		System.out.println (patientListStart.countingPatients(patientListStart));
		System.out.println (patientListStart.countingPatientsIterative());

	}
	public static void main ( String [] args )
	{
		// ...
		HospitalManager hm = new HospitalManager();
		hm.launch();
		hm.printPatientDetails();
		hm.printPatientCount();
	}
}