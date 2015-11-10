
public class source {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   int[] a = {1000, 5000,950,15000,1700,3000}; 	
	   Bank b;
	   for (int i = 0; i < 6; ++i){
		   b = new Bank(a[i]);
		   b.handle();
	   }
	}

}
