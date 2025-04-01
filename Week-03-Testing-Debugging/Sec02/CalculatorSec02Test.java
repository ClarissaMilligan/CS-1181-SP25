import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSec02Test
{
    @Test
    public void verifyAddOperation() throws Exception
    {
        assertEquals(4, CalculatorSec02.add(2,2));
        assertEquals(-5, CalculatorSec02.add(-1,-4));
        assertEquals(10, CalculatorSec02.add(4,6));
        assertNotEquals(0, Calculator.add(10,10));
        assertThrows(Exception.class, () -> Calculator.add(1, 6));
    }
}
