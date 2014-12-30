public class Patient
{
			private String name;
			private int age;
			private String illness;
			private Patient nextPatient;
			private Patient prevPatient;
			public Patient(String name, int age, String illness)
			{
				this.name = name;
				this.age = age;
				this.illness = illness;
				this.nextPatient = null;
				this.prevPatient = null;
			}

// other methods come here...

			// this is a member method of class Patient
			public void addPatient(Patient newPatient)
			{
				if (this.nextPatient == null) {
				// this means this is the last patient in the list
				this.nextPatient = newPatient;
				newPatient.prevPatient = this;
				} else {
				this.nextPatient.addPatient(newPatient);
				}
			}

			// this is a member method of class Patient
			// returns true if the patient was found and removed, false otherwise

			public boolean deletePatient(Patient patient)
			{
				if (this.nextPatient == null) {
				// patient to remove was not found
				return false;
				} else if (this.nextPatient.name.equals(patient.name)) {
				// We found it! It is the next one!
				// Now link this patient to the one after the next
				this.nextPatient = nextPatient.nextPatient;
				return true;
				} else {
				return this.nextPatient.deletePatient(patient);
				}
			}
			public void printPatient ( Patient patient)
			{
				if (patient.nextPatient == null)
					System.out.println ( patient + "/n");
				else
				{
					System.out.println (patient);
					printPatient (patient.nextPatient);
				}
			}


}