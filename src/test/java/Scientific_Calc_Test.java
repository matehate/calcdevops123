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
    public void sqrotTrueNegative()
    {
        assertNotEquals("Finding square root for True Negative", 6, calc.sqrot(10), DIFF);
        assertNotEquals("Finding square root for True Negative", 12, calc.sqrot(27), DIFF);
    }

    @Test
    public void factTruePositive()
    {
        assertEquals("Finding factorial for True Positive", 24, calc.factorial(4), DIFF);
        assertEquals("Finding factorial for True Positive", 720, calc.factorial(6), DIFF);
    }

    @Test
    public void factTrueNegative()
    {
        assertNotEquals("Finding factorial for True Negative", 0, calc.factorial(0), DIFF);
        assertNotEquals("Finding factorial for True Negative", 1, calc.factorial(2), DIFF);
    }

    @Test
    public void logTruePositive()
    {
        assertEquals("Finding natural log for True Positive", 0, calc.natural_log(1), DIFF);
        assertEquals("Finding natural log for True Positive", 0, calc.natural_log(1), DIFF);
    }

    @Test
    public void logTrueNegative()
    {
        assertNotEquals("Finding natural log for True Negative", 4, calc.natural_log(1), DIFF);
        assertNotEquals("Finding natural log for True Negative", 1, calc.natural_log(10), DIFF);
    }

    @Test
    public void powTruePositive()
    {
        assertEquals("Finding power for True Positive", 16, calc.power(2,4), DIFF);
        assertEquals("Finding power for True Positive", 1, calc.power(1,6), DIFF);
    }

    @Test
    public void powTrueNegative()
    {
        assertNotEquals("Finding power for True Negative", 3, calc.power(1,3), DIFF);
        assertNotEquals("Finding power for True Negative", 6, calc.power(2,3), DIFF);
    }
}
