package com.xyzcorp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by dhino_000 on 2/25/14.
 */
public class EmployeeTest {
    @Test
    public void testMiddleName() {
        Employee employee = new Employee("Harry", "S", "Truman");
        assertEquals("Z", employee.getMiddleName());
    }
}
