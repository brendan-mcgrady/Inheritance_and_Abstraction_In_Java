import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

// Again test all methods for both classes.

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Brendan", "JW745NL5", 25000);
    }

    @Test
    public void getDeveloperName() {
        assertEquals("Brendan", developer.getName());
    }

    @Test
    public void getDeveloperNINumber() {
        assertEquals("JW745NL5", developer.getnINumber());
    }

    @Test
    public void getDeveloperSalary() {
        assertEquals(25000, developer.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(26000, developer.getSalary(), 0.00);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(250, developer.payBonus(), 0.00);
    }

}