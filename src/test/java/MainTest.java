import org.example.Main;
import static org.junit.Assert.*;

import org.junit.Test;
public class MainTest {
    private static final double DELTA = 1e-15;
    Main main = new Main();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 120, main.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, main.factorial(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, main.factorial(4), DELTA);
    }

    @Test
    public void factorialFalsePositive() {
        assertNotEquals("Finding factorial of a number for False Positive", 120, main.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, main.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 8, main.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, main.power(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive() {
        assertNotEquals("Finding power for False Positive", 6, main.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, main.power(2, 3), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, main.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, main.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive() {
        assertNotEquals("Finding natural log for False Positive", 6, main.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, main.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 2, main.squareRoot(4.0), DELTA);
        assertEquals("Finding square root for True Positive", 1, main.squareRoot(1.0), DELTA);
    }

    @Test
    public void sqrootFalsePositive() {
        assertNotEquals("Finding square root for False Positive", 1, main.squareRoot(3.0), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, main.squareRoot(4.0), DELTA);

    }
}
