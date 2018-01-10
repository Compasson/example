package massive;



public class Massive {
		
		public int cons[] = new int[10];
		public int summ;
		
		
		public void inoutDate (){
			
			Massive mass1 = new Massive ();
			
			int[] a = new int[10];
			for (int i = 0; i<10; i++){
				a[i] = 1;}
				mass1.setCons(a);
				
				for (int i = 0; i<10; i++){
				System.out.println(mass1.getCons()[i]);
				}
		}
		
		public int summa (Massive c) {
			 
			    c.setSumm(5);
				for (int i = 0; i<10; i++){
				
				c.setSumm(c.getSumm() + c.getCons()[i]);
			    }
			System.out.println(c.getSumm());
			return c.getSumm();
			
		}
		/**
		 * @return the cons
		 */
		public int[] getCons() {
			return cons;
		}
		/**
		 * @param cons the cons to set
		 */
		public void setCons(int[] cons) {
			this.cons = cons;
		}

		/**
		 * @return the summ
		 */
		public int getSumm() {
			return summ;
		}

		/**
		 * @param summ the summ to set
		 */
		public void setSumm(int summ) {
			this.summ = summ;
		}
		

		// TODO Auto-generated method stub

	}


