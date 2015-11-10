
public class SuperVisor {
	private int sum;
	  
	  public SuperVisor(int sum){
		  this.sum = sum;
	  }
	  
	  public void handle(){
		  if (this.sum<6000)
			  System.out.println("Operation is permitted by SuperVisor! You getting "+sum+"$"+"\n"); else
				  System.out.println("Operation is forbidden by SuperVisor! Sorry you must apply to another bank"+"\n");
	  }
}
