package com.fp.fp;
import com.fp.fp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class StaffTest {

    /**
     * Test of setWorkload method, of class Staff.
     */
    @Test
    public void testSetWorkload() throws Exception {
        System.out.println("setWorkload");
        int workload = 50;
        Staff instance = new Staff();
        try {
            instance.setWorkload(workload);
            fail("");

        } catch (Exception e) {
        }
        instance.setWorkload(20);
    }

    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Staff instance = new Staff();
        String expResult = "Staff";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of ComputePayRoll method, of class Staff.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        Staff instance = new Staff();

        try {
            int workload = 30;
            double expResult = (workload * 32 * 2) * 0.75;
            instance.setWorkload(workload);
            double result = instance.ComputePayRoll();
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
            fail("");
        }
    }

}
