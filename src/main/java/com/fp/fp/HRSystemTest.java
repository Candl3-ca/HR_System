package com.fp.fp;

import com.fp.fp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class HRSystemTest {

    /**
     * Test of addPerson method, of class HRSystem.
     */
    @Test
    public void testAddPerson() throws Exception {
        System.out.println("addPerson");
        int depID = -10;
        Person person = new Staff();
        HRSystem instance = new HRSystem();
        try {
            instance.addPerson(depID, person);
            fail();

        } catch (Exception e) {
            depID = 1;
            instance.addPerson(depID, person);
        }

    }

    /**
     * Test of setDean method, of class HRSystem.
     */
    @Test
    public void testSetDean() throws Exception {
        System.out.println("setDean");
        int depID = 1;
        Person person = new Staff();
        HRSystem instance = new HRSystem();
        try {
            instance.setDean(depID, person);
            fail();

        } catch (Exception e) {
            try {
                depID = -10;
                instance.setDean(depID, new FullTime());
                fail();
            } catch (Exception ex) {
                depID = 1;
                instance.setDean(depID, new FullTime());
            }

        }
    }

}
