package com.fp.fp;

import com.fp.fp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class DepartmentTest {

    /**
     * Test of addPerson method, of class Department.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Person person = new FullTime();
        Department instance = new Department();
        try {

            instance.addPerson(person);
            instance.addPerson(person);
            fail("");
        } catch (Exception e) {
        }
    }

}
