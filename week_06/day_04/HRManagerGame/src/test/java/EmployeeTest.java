import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee1;

    @Before
    public void before(){
        employee1 = new Employee("Bob", 1234, 250000.00);
    }

    @Test
    public void nameTest(){
        assertEquals("Bob", employee1.name());
    }

    @Test
    public void niTest(){
        assertEquals(1234, employee1.ni());
    }
    @Test
    public void salaryTest(){
        assertEquals(250000.00, employee1.salary(),0.01);
    }

    @Test
    public void raiseSalaryTest(){
        employee1.incrementSalary(2);
        assertEquals(255000.00, employee1.salary(), 0.01);
    }
}
