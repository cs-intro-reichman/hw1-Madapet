// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Replace this comment with your code\
		int lim = Integer.parseInt(args[0]); // Get from the user the maximum for the range 
		double a = Math.random() * lim; // First random number insdie the range 
		double b = Math.random() * lim; // Secound random number inside the range  
		double c = Math.random() * lim; // third random number inside the range 
		int max = Math.max((int)a, Math.max((int)b, (int)c)); // Get the maximum number 
		int min = Math.min((int)a, Math.min((int)b, (int)c)); // Get the minimum number 
		int middle = (int)(a+b+c)-min-max; // Get the middle number 
		// Print by order
		System.out.println((int)a +" "+ (int)b +" "+ (int)c); 
		System.out.println(max + " " + middle +" "+ min);
	}
}
