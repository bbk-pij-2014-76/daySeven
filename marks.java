import java.util.Scanner;

public class marks {
		private String s;
		public int readList ( String s ) {
				return Integer.parseInt(s);
		}

		public static void main ( String [] args ) {
			Scanner sc = new Scanner(System.in);
			int theMark=0;
			int studentCounter=0;
			marks mks = new marks();
			int distinction=0;
			int pass=0;
			int fail=0;
			int invalid=0;
			do {
					System.out.println ( " Input a mark ");
					mks.s=sc.nextLine();
					studentCounter++;
					theMark = mks.readList(mks.s);
					if (theMark >=70 && theMark <=100 ) {
							distinction = distinction + 1;
					} else if ( theMark <=69 && theMark>=50) {
							pass = pass + 1;
					} else if ( theMark <=40 && theMark>=0) {
							fail = fail + 1;
					} else if (theMark > 100 || theMark < 0 )  {
							invalid = invalid + 1;
					}
			} while (theMark != -1);
			invalid--;

			System.out.println ( " There are " + studentCounter + " students : "+ distinction +" distinctions, " + pass + " pass," + fail + " fail ( plus " + invalid + " invalid ) ");



		}
}


