// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int inputNum = Integer.parseInt(args[0]);
		System.out.println("Units - " + inputNum%10);
		System.out.println("Tens - " + ((inputNum/10)%10)*10);
		System.out.println("Hundreds - " + inputNum/100*100);

	}
}
