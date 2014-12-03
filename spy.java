public class spy {
		private static int spyCount=0;
		private int spyId;

		public spy ( int spyId ) {
				spyCount++;
				this.spyId = spyId;
				System.out.println ( " The ID of the spy is " + spyId + " and the no of spies so far is " + spyCount );
		}

		public void die () {
						spyCount--;
						System.out.println ( " Spy " + spyId + "has been detected and eliminated and spies left so far " + spyCount);
		}

		public static void main (String [] args ) {
				spy Ali = new spy(928);
				spy Kili = new spy(931);
				spy Annasi = new spy(914);
				spy Antonio = new spy(415);
				Ali.die();
		}

}