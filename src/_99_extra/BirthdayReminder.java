
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		
		
		
		
		
		
		
		
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 5th";
		String dadsBirthday = "April 26";
		String myBirthday = "September 17";

		
	String q1 =	JOptionPane.showInputDialog(null, "What birthday do you want?");
	if(q1.equalsIgnoreCase("mom")) {
		System.out.println(momsBirthday);
	}

	if(q1.equalsIgnoreCase("dad")) {
		System.out.println(dadsBirthday);
	}
	
	if(q1.equalsIgnoreCase("Ryan Smith")) {
		System.out.println(myBirthday);
	}
		
	else {
		System.out.println("Sorry, I do not remember that person's birthday.");
	}
		
		// 2. Find out which birthday the user wants and and store their response in a variable
	
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
