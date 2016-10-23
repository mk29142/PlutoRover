package TestSuite;

import org.junit.Test;
import static org.junit.Assert.*;


import src.*;

public class RoverTest {
	
	@Test
	public void moveNorthTest() {
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.N, surface);
		rover.move();
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 0);
		assertEquals(y, 1);
	}
	
	@Test
	public void moveEastTest() {
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.E, surface);
		rover.move();
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 1);
		assertEquals(y, 0);
	}
	
	@Test
	public void OutOfBoundsTest1() {
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.W, surface);
		rover.move();
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 0);
		assertEquals(y, 0);
	}
	
	@Test
	public void OutOfBoundsTest2() {
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.S, surface);
		rover.move();
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 0);
		assertEquals(y, 0);
	}
	
	@Test
	public void rotationTest1() {
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.N, surface);
		
		rover.move();
		rover.rotate(Rotation.RIGHT);
		rover.move();
		rover.move();
		
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 2);
		assertEquals(y, 1);	
	}
	
	@Test
	public void rotationTest2() {
		Surface surface = new Surface(10, 10);
		Rover rover = new NormalRover(0, 0, Direction.N, surface);
		
		rover.move();
		rover.rotate(Rotation.LEFT);
		rover.move();
		rover.move();
		
		int x = rover.getX();
		int y = rover.getY();
		assertEquals(x, 0);
		assertEquals(y, 1);	
	}

}
