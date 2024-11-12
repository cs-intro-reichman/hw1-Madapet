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
		double bill = Double.parseDouble(args[3]); // Get the bill 
		bill = bill / 3.0; // Divide the bill to three 
		System.err.println("Dear " +name3 +", "+ name2 +", and " + name1 +": pay " + Math.ceil(bill) +" Shekels each" ); // Print
		
		

	}
}