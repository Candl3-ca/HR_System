package com.fp.fp;

import com.fp.fp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartTimeTest {

    /**
     * Test of ComputePayRoll method, of class PartTime.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        int hoursWorked = 20;
        int degreeRate = 112;
        PartTime instance = new PartTime();
        instance.setDegree("PhD");
        instance.setHoursWorked(hoursWorked);
        double expResult = (hoursWorked * degreeRate * 2) * 0.76;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
    }

}
