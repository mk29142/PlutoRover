package TestSuite;

import static org.junit.Assert.*;
import org.junit.Test;
import src.Surface;

public class SurfaceTest {
	
	@Test
	public void GridInitTest1(){
		Surface testSurface = new Surface(10, 10);
		int width = testSurface.getWidth();
		int height = testSurface.getHeight();
		assertEquals(width, 10);
		assertEquals(height, 10);
	}
	
	@Test
	public void GridInitTest2(){
		Surface testSurface = new Surface(5, 10);
		int width = testSurface.getWidth();
		int height = testSurface.getHeight();
		assertEquals(width, 5);
		assertEquals(height, 10);
	}
	
	
}