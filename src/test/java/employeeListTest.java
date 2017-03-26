import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tank on 3/23/2017.
 */
public class employeeListTest {
    employeeList employee1;
    employeeList employee2;
    employeeList employee3;

    @Before
    public void setUp() throws Exception {
        employee1 = new employeeList("Oko Bomo", "Design");
        employee2 = new employeeList("Big Ben", "Electrical Engineering");
        employee3 = new employeeList("Chris Love", "Cameraman");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStudentList() throws Exception {
        List employeeList = new ArrayList();

        employeeList.add(employee1.getEmployeeName());
        employeeList.add(employee2.getEmployeeName());
        employeeList.add(employee3.getEmployeeName() + "\n");

        System.out.print("New employees: " + employeeList + "\n");
        System.out.print("The number of new employees is: " + employeeList.size() + "\n");

        employeeList.remove(0);
        System.out.print("Employess after resigning: " +employeeList);
        System.out.print("The number of employees now is: " + employeeList.size());

        Assert.assertEquals("Oko Bomo", employee1.getEmployeeName());
    }

}
