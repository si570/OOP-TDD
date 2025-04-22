package atu.ie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }
    @Test
    void testSubtractionException() {
        Exception exception = assertThrows(IllegalStateException.class, () -> calculator.subtract(3, 5));
        assertEquals("Negative result not allowed.", exception.getMessage());
    }
    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    void testMultiplicationOverflow() {
        assertThrows(UnsupportedOperationException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2));
    }



}
