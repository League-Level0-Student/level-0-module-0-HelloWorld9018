package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
public static void main(String[] args){
	String x = JOptionPane.showInputDialog(null, "What's your favorite color?");
	
	JOptionPane.showMessageDialog(null, "Wow, " + x + " is my favorite color too!!!");
	Robot b=new Robot();
	b.setRandomPenColor();
	b.penDown();
	b.setSpeed(900);
	b.turn(90);
	b.move(500);

}
}

