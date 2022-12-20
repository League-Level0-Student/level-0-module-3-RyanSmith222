package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class choose_adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	String q1 = JOptionPane.showInputDialog(null, "Your cargo ship crash lands on Tatooine. Your crew decides " +
			" that you should go search for help. After exiting the ship, you gaze off into the distance. " +
			"You see a Jawa sandcrawler and the Mos Eisley Cantina. Type 1 if you want to go to the sandcrawler, " +
			"and type 1 if you want to go to the cantina type 2. ");
		
		if(q1.equalsIgnoreCase("1")) {
			JOptionPane.showMessageDialog(null, "The jawas welcome you into their crew in exchange for permission"
					+ " to scavenge your ship. You put on a brown cloak and your eyes begin glowing yellow."
					+ "You live the rest of life as a Jawa.");
		}
		
		else {
			String q2 = 	JOptionPane.showInputDialog(null, "You enter the Mos Eisley Cantina and take a"
					+ " seat in a booth. The imfamous bouty hunter by the name of Greedo sits oppostie to you. he has a bandage"
					+ " around his chest, clearly recovering from a gunshot. That is when you remember that you lost all of your money"
					+ " investing in theme restaraunts, and took some desperate loans from Jabba the Hut. Greedo is there to kill you."
					+ " If you want to shoot Greedo because you already know that he is going to shoot you, type 1. If you want to wait and let"
					+ " Greedo try to shoot you before opening fire, type 2.");
			
			if(q2.equalsIgnoreCase("1")) {
				JOptionPane.showMessageDialog(null, "You chose the right choice, the original choice. You shoot Greedo and he collapses"
						+ " down on the table. The music stops for a moment, but it quickly resumes. This near death experience makes"
						+ "you want to fulfill your lifelong dream: creating a galactically broadcast instructional cooking show where the host has four arms, so it"
						+ " is really hard to follow for two-armed viewers. You live out the rest of your life happily and recieve a lot of fan mail from "
						+ "your loyal viewers on Kashyyyk.");
					}
			
			
				else if (q2.equalsIgnoreCase("2")) {
					JOptionPane.showMessageDialog(null, "You made the wrong choie. Greedo shoots at you, and you awkwardly scoot out of the way"
							+ " and dodge the laser. You shoot him back and survive but at what cost? You comprimised the integrity of your story "
							+ "to appeal to younger audiences and make yourself seem more heroic. The rest of your life consists of endless adventures with teddy-bear-selling cash grabs including"
							+ "including ewoks and porgs. The integrity of your life is completely gone, but at least you have money from selling action figures. ");		
					
			}
		}
		
		
	
		
		
		
	
		
			
		
		
	}
	
	
}
