// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// To get you started, here is the first line in the program:

	    String name1 = args[0]; // Gets from the user the first name 
	    String name2 = args[1]; // Gets from the user the secound name 
	    String name3 = args[2]; // Gets from the user the third name 
		int bill = Integer.parseInt(args[3]); // Get the bill 
		bill = Math.ceil((double)bill / 3.0);
		System.err.println("Dear " +name3 +", "+ name2 +", and " + name1 +": pay " + (double)bill +" Shekels each" ); // Print
		
		

	}
}