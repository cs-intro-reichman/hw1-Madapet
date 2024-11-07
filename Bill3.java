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
		bill = Math.divideExact(bill, 3); // Divide the bill to three 
		System.err.println(name1 +" , "+ name2 +" and " + name3 + " needs to pay " + bill +" each" ); // Print
		

	    // Replace this comment with the rest of your code   
	}
}