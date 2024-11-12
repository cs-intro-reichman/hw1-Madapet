// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double saving = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		double timeFrame = Double.parseDouble(args[2]);
		double rate = interestRate / 100;
		double futureValue = saving;
		double time = timeFrame;
		while (time >0 ) {
			time --;
			futureValue += futureValue * rate;
		}
		System.err.print("After "+(int)timeFrame+" years, a $"+ (int)saving+ " saved at "+ interestRate+"%25 will yield $"+(int)futureValue);
		// Replace this comment with your code
	}
}