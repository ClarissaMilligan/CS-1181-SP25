import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest
{
    @Test
    public void verifyAddOperation() throws Exception
    {
        assertEquals(4, Calculator.add(2,2));
        assertEquals(-6, Calculator.add(-3, -3));
        assertNotEquals(0, Calculator.add(2,3));
        assertThrows(Exception.class, () -> Calculator.add(1, 1));
    }
}
