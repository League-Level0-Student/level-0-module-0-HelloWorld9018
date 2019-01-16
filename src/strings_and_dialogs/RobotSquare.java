package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot q=new Robot("batman");
    	
        // 3. Put the robot's pen down
q.moveTo(350, 400);
q.penDown();
q.setSpeed(200);
q.setPenWidth(100000000);
for (int i = 0; i < 4; i++) {
	q.setRandomPenColor();
q.move(200);
q.turn(90);	
}
q.moveTo(340, 390);
for (int i = 0; i < 4; i++) {
	q.setRandomPenColor();
q.move(200);
q.turn(90);	
}

q.moveTo(330, 380);
for (int i = 0; i < 4; i++) {
	q.setRandomPenColor();
q.move(200);
q.turn(90);	
}

q.moveTo(320, 370);
for (int i = 0; i < 4; i++) {
	q.setRandomPenColor();
q.move(200);
q.turn(90);	
}

q.moveTo(310, 360);
for (int i = 0; i < 4; i++) {
	q.setRandomPenColor();
q.move(200);
q.turn(90);	
}



        // 6. Make the robot move as fast as possible


        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
