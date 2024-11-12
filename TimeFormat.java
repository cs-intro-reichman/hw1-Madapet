/* 
// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String am_pm;
        // Replace this comment with the rest of your code
		// hours 
		if (hours > 11){
			am_pm = "PM";
			if (hours == 12){System.err.print(hours);}else{
				if (hours == 24){System.err.print("00");}else{
				if (hours - 12 > 10){System.out.print((hours-12));}else {System.err.print("0" + (hours-12));}}
			}
		}

		
		else{
			am_pm ="AM";
			if (hours < 10 ){
				System.out.print("0"+hours);
			}else {System.err.print(hours);}

		}
		// minutes 
		if (minutes == 0 || minutes < 10){
			if (minutes == 0){System.out.print(":00");}else {System.out.print(":0"+minutes);};
		}else {System.err.print(":"+minutes);}
		System.out.print(" "+am_pm);

		
	
}
}*/
// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String am_pm;
        // Replace this comment with the rest of your code
		// hours 
		if (hours > 11){
			am_pm = "PM";
			if (hours == 12){System.err.print(hours);}else{
				if (hours == 24){System.err.print("0");}else{
				if (hours - 12 > 10){System.out.print((hours-12));}else {System.err.print((hours-12));}}
			}
		}
		else{
			am_pm ="AM";
			if (hours < 10 ){
				System.out.print(+hours);
			}else {System.err.print(hours);}

		}
		// minutes 
		if (minutes == 0 || minutes < 10){
			if (minutes == 0){System.out.print(":00");}else {System.out.print(":0"+minutes);};
		}else {System.err.print(":"+minutes);}
		System.out.print(" "+am_pm);

		
	
}
}