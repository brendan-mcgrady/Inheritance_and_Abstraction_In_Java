import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

// Test all methods including raiseSalary and payBonus

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John", "JW745NL5", 30000,"Cool Department");
    }

    @Test
    public void getManagerDept() {
        assertEquals("Cool Department", manager.deptName());
    }

    @Test
    public void getManagerName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void getManagerNINumber() {
        assertEquals("JW745NL5", manager.getnINumber());
    }

    @Test
    public void getManagerSalary() {
        assertEquals(30000, manager.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(31000, manager.getSalary(), 0.00);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(300, manager.payBonus(), 0.00);
    }

}