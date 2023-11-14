import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddFail() {
        assertEquals(5, calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    /*assertEquals(expected, actual, delta);
    expected: The expected value.
    actual: The actual value.
     delta: The maximum allowed difference between the expected and actual values for them to be considered equal.
     */
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }

    @Test
    public void testDivideByZero() {
        //A lambda expression is a concise way to represent an anonymous function or a block of code
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

}

