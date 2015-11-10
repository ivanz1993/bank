
public class Bank {
	private int sum;
	
	public Bank(int sum){
		this.sum = sum;
	}
	public void handle(){
	   	new Clerk(this.sum).handle(); 	 
	}
}
