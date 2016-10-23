package TestSuite;

import org.junit.Test;
import static org.junit.Assert.*;


import src.*;

public class WrappingRoverTest {
	
	
	@Test
	public void OutOfBoundsTest1() {
		Surface surface = new Surface(10, 10);
		Rover rover = new WrappingRover(0, 0, Direction.W, surface);
		rover.move();
		rover.move();
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 8);
		assertEquals(y, 0);
	}
	
	@Test
	public void OutOfBoundsTest2() {
		Surface surface = new Surface(10, 10);
		Rover rover = new WrappingRover(0, 0, Direction.W, surface);
		rover.move();
		rover.rotate(Rotation.RIGHT);
		rover.rotate(Rotation.RIGHT);
		rover.move();
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 0);
		assertEquals(y, 0);
	}

}
