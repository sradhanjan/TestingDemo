import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testEquilateralTriangle() {
    	Calculator triangle = new Calculator(5, 5, 5);
        Assert.assertEquals("Equilateral", triangle.showType());
    }

    @Test
    public void testIsoscelesTriangle() {
    	Calculator triangle = new Calculator(4, 5, 5);
        Assert.assertEquals("Isosceles", triangle.showType());
    }

    @Test
    public void testScaleneTriangle() {
    	Calculator triangle = new Calculator(3, 4, 5);
        Assert.assertEquals("Scalene", triangle.showType());
    }

    @Test
    public void testInvalidTriangle() {
        // An invalid triangle where the sum of any two sides is less than or equal to the third side
    	Calculator triangle = new Calculator(1, 2, 5);
        Assert.assertNotEquals("Equilateral", triangle.showType());
        Assert.assertNotEquals("Isosceles", triangle.showType());
        Assert.assertNotEquals("Scalene", triangle.showType());
    }
}