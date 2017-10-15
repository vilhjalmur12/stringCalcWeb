package is.ru.hugb.calc;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void testEmptyStringReturnsZero() {
        StringCalculator Calculator = new StringCalculator();
        assertEquals(0, Calculator.add(""));
    }
}
