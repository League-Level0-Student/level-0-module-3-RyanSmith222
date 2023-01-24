
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		
		
	
		
		
	String q1 =	JOptionPane.showInputDialog(null, "Do you like bananas?");
		
	if(q1.equals("no")) {
		JOptionPane.showMessageDialog(null, "You are crazy.");	
	}
		
	else if(q1.equals("yes")) {
		String q2 = JOptionPane.showInputDialog(null, "What is your favorite hobby?");
		JOptionPane.showMessageDialog(null, q2 + " is much better with bananas!");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Are you bananas?");
	}
	
		//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}

}
