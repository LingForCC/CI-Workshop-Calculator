import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    private final Calculator calculator = new Calculator();

    @Test
    public void addition() {
        assertEquals(3, calculator.calculate("add", 2, 1));
    }

    public void subsctraction() {
        assertEquals(1, calculator.calculate("substract", 2, 1));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.calculate("divide", 2, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideZero() {
        calculator.calculate("divide", 2, 0);
    }
}
