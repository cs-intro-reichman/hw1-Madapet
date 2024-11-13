// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	/**
	 */
	public static void main(String[] args) {
		
		// To get you started, here is the first line in the program:
		System.err.println("");

	   
		int bill = Integer.parseInt(args[3]); // Get the bill 
		bill = (int) Math.ceil(bill / 3.0);
	
		System.err.println("Dear " +args[2] +", "+ args[1] +", and " + 
		args[0] +": pay " + (double)bill +" Shekels each" ); 

	}
}