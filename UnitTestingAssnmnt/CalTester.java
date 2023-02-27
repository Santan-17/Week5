package UnitTestingAssnmnt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
public class CalTester {
	@Test
    public void testCalculateSimpleInterest() throws Exception {
        Calculator calculator = new Calculator();
        double principal = 1000;
        double time = 2;
        double rate = 0.05;
        double expectedInterest = 100;
        double actualInterest = calculator.calculateSimpleInterest(principal, time, rate);
        assertEquals(expectedInterest, actualInterest, 0);
    }

    @Test
    public void testCalculateSimpleInterestWithInvalidPrincipal() {
        Calculator calculator = new Calculator();
        double principal = -1000;
        double time = 2;
        double rate = 0.05;
        assertThrows(InvalidPrincipalException.class,
                () -> calculator.calculateSimpleInterest(principal, time, rate));
    }

    @Test
    public void testCalculateSimpleInterestWithInvalidTime() {
        Calculator calculator = new Calculator();
        double principal = 1000;
        double time = -2;
        double rate = 0.05;
        assertThrows(InvalidTimeException.class,
                () -> calculator.calculateSimpleInterest(principal, time, rate));
    }

    @Test
    public void testCalculateSimpleInterestWithInvalidRate() {
        Calculator calculator = new Calculator();
        double principal = 1000;
        double time = 2;
        double rate = -0.05;
        assertThrows(InvalidRateException.class,
                () -> calculator.calculateSimpleInterest(principal, time, rate));
    }
}
