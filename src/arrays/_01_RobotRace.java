package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot [] robots = new Robot[5];
	//3. use a for loop to initialize the robots in your array.
int y = 100;
for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot();
	robots[i].setSpeed(100);
	robots[i].turn(90);
robots[i].setY(y);
y+=100;
robots[i].setX(101);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random r = new Random();
while (true) {
	

for (int i = 0; i < robots.length; i++) {
	robots[i].move(r.nextInt(9));
	robots[i].turn(-2);
	if (robots[i].getX()<=0) {
		JOptionPane.showMessageDialog(null, "Robot "+i+" wins!");
		return;
	}
	
}
}
//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a half circular track.

}
}