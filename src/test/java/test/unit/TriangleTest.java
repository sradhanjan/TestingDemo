package test.unit;
import static org.junit.Assert.assertEquals;
import app.Triangle;
import org.junit.Test;


public class TriangleTest {

	@Test
	public void testEquilateralTriangle() {
		Triangle triangle = new Triangle(5,5,5);
		assertEquals("Equilateral", triangle.showType());
	}
	@Test
	 public void testIsoscelesTriangle() {
		Triangle triangle = new Triangle(3, 3, 5);
	 assertEquals("Isosceles", triangle.showType());
	 }
	 @Test
	 public void testScaleneTriangle() {
		 Triangle triangle = new Triangle(3, 4, 5);
	 assertEquals("Scalene", triangle.showType());
	 }
}
