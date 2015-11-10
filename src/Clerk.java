
import java.util.Random;


public class Clerk {
  private int sum;
  
  public Clerk(int sum){
	  this.sum = sum;
  }
  
  public void handle(){
	      Random r = new Random();
	      int num = r.nextInt(15);
	      if (this.sum<=1000)
	    	  System.out.println("Operation is permitted by "+num+"th "+ "clerk!"+" You getting "+sum+"$"+"\n"); else{
	    		  System.out.println("Operation is forbidden by "+num+"th "+ "clerk!"+" You forward to maneger "+"\n");
	    	      new Maneger(sum).handle();
	    	  }
  }
}
