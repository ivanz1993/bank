import java.util.Random;


public class Maneger {
	private int sum;
	  
	  public Maneger(int sum){
		  this.sum = sum;
	  }
	  
	  public void handle(){
	      Random r = new Random();
	      int num = r.nextInt(14)+1;
	      if (this.sum<=4000)
	    	  System.out.println("Operation is permitted by "+num+"th"+ " Maneger!"+" You getting "+sum+"$"+"\n"); else{
	    		  System.out.println("Operation is forbidden by "+num+"th"+ " Maneger!"+" You forward to SuperVisor "+"\n");
	    	      new SuperVisor(sum).handle();
	    	  }
  }
}
