package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


JOptionPane.showMessageDialog(null,"Please answer with only yes or no.");	

String q1 = JOptionPane.showInputDialog("Are you happy?");	

if(q1.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	
}

if(q1.equals("no")) {
	
	String q2 = JOptionPane.showInputDialog(null, "Do you want to be happy?");
	
	 if(q2.equals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
		 if(q2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
	
		
		
		}
		
}
			
	

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
