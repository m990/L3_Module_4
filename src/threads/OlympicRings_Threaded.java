package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Robot blue;
	Robot black;
	Robot red;
	Robot orange;
	Robot green;
	
	int angle = 0;
	public static void main(String[] args) {
		OlympicRings_Threaded or = new OlympicRings_Threaded();
		or.blue = new Robot();
		or.black = new Robot();
		or.red = new Robot();
		or.orange = new Robot();
		or.green = new Robot();
		
		or.blue.setSpeed(10);
		or.black.setSpeed(10);
		or.red.setSpeed(10);
		or.orange.setSpeed(10);
		or.green.setSpeed(10);
		
		or.blue.penDown();
		or.black.penDown();
		or.red.penDown();
		or.orange.penDown();
		or.green.penDown();
		
		or.blue.setX(200);
		or.black.setX(600);
		or.red.setX(1000);
		or.orange.setX(450);
		or.green.setX(750);
		
		or.blue.setY(300);
		or.black.setY(300);
		or.red.setY(300);
		
		or.blue.setPenColor(Color.BLUE);
		or.black.setPenColor(Color.BLACK);
		or.red.setPenColor(Color.RED);
		or.orange.setPenColor(Color.orange);
		or.green.setPenColor(Color.GREEN);
		
		Thread blue = new Thread(() -> or.circle(or.blue));
		Thread black = new Thread(() -> or.circle(or.black));
		Thread red = new Thread(() -> or.circle(or.red));
		Thread orange = new Thread(() -> or.circle(or.orange));
		Thread green = new Thread(() -> or.circle(or.green));
		
		blue.start();
		black.start();
		red.start();
		orange.start();
		green.start();
		
	}
	void circle(Robot r) {
		for (int i = 0; i < 72; i++) {
			r.move(20);
			angle += 1;
			r.setAngle(angle);
		}
	}
}

