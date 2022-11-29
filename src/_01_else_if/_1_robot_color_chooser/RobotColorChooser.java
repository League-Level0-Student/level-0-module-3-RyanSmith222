
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		for(int bigCount = 0; bigCount <= 100000; bigCount++) {
		
Robot rob = new Robot();

rob.penDown();
rob.setSpeed(100);
rob.setPenWidth(10);
String color = JOptionPane.showInputDialog(null, "What color pen would you like the robot to draw with? Choose between green, red, black, blue, and yellow. Please enter in lowercase.");

if(color.equals("green")) {
	rob.setPenColor(0,255,0);
}

else if(color.equals("red")) {
	rob.setPenColor(255,0,0);
}

else if(color.equals("blue")) {
	rob.setPenColor(0,0,255);
}

else if(color.equals("yellow")) {
	rob.setPenColor(255,255,0);
}

else if(color.equals("black")) {
	rob.setPenColor(0,0,0);
}


else {
	Random ran = new Random();
		int number = ran.nextInt(5 - 1 + 1) + 1;		

		if(number == 1) {
			rob.setPenColor(0,255,0);
		}
		
		if(number == 2) {
			rob.setPenColor(255,0,0);
		}
		
		if(number == 3) {
			rob.setPenColor(0,0,255);
		}
		
		if(number == 4) {
			rob.setPenColor(255,255,0);
		}
		
		if(number == 5) {
			rob.setPenColor(0,0,0);
		}
}




for(int count = 0; count <= 10; count++) {
	rob.move(100);
	rob.turn(45);
}


		}
		



	}
}
