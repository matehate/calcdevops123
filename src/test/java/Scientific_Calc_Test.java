import Scientific_Calc.Scientific_Calc;

import static org.junit.Assert.*;
import org.junit.Test;

public class Scientific_Calc_Test
{
    private static final double DIFF = 1e-15;
    Scientific_Calc calc = new Scientific_Calc();

    @Test
    public void sqrotTruePositive()
    {
        assertEquals("Finding square root for True Positive", 2, calc.sqrot(4), DIFF);
        assertEquals("Finding square root for True Positive", 1, calc.sqrot(1), DIFF);
    }

    @Test
    public void sqrotFalsePositive()
    {
        assertNotEquals("Finding square root for False Positive", 6, calc.sqrot(10), DIFF);
        assertNotEquals("Finding square root for False Positive", 12, calc.sqrot(27), DIFF);
    }
}
