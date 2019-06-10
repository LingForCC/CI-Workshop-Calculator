import org.junit.Test;
import static org.junit.Assert.*;

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
    public void divide() {
        assertEquals(1, calculator.calculate("divide", 4, 3));
    }

    @Test
    public void divideEqualsZero() {
        assertEquals(0, calculator.calculate("divide", 3, 4));
    }


    @Test
    public void divideZero() {
    }
}
