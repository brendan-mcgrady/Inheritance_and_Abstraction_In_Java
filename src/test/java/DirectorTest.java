import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.*;

// Test all methods.

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Melinda, CEO", "7HDG543L", 250000, "CC 4eva", 25);
    }

    @Test
    public void canGetName() {
        assertEquals("Melinda, CEO", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("7HDG543L", director.getnINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(250000, director.getSalary(), 0.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("CC 4eva", director.deptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(25, director.getBudget(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5);
        assertEquals(250005, director.getSalary(), 0.00);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(5000, director.payBonus(), 0.00);
    }

    @Test
    public void cannotInputNegativeValueForRaise() {
        director.raiseSalary(-5);
        assertEquals(250000, director.getSalary(), 0.00);
    }

    @Test
    public void cannotInputNullValueWhileSettingName() {
        director.setName(null);
        assertEquals("Melinda, CEO", director.getName());
    }

}

