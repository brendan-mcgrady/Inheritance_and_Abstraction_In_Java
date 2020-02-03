import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

// Again test all methods for both classes.

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before () {
        databaseAdmin = new DatabaseAdmin("Boring But Welfy Dude", "73HBID98", 35000);
    }

    @Test
    public void canGetName() {
        assertEquals("Boring But Welfy Dude", databaseAdmin.getName());
    }

    @Test
    public void canGetnINumber() {
        assertEquals("73HBID98", databaseAdmin.getnINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2500);
        assertEquals(37500, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(350, databaseAdmin.payBonus(), 0.00);
    }

}
