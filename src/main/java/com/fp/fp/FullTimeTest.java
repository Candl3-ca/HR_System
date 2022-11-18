package com.fp.fp;
import com.fp.fp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FullTimeTest {

    /**
     * Test of ComputePayRoll method, of class FullTime.
     */
    @Test
    public void testComputePayRoll() {
        System.out.println("ComputePayRoll");
        FullTime instance = new FullTime();
        instance.setDegree("PhD");
        int degreeRate = 112;
        double expResult = (32 * degreeRate * 2) * 0.85;
        double result = instance.ComputePayRoll();
        assertEquals(expResult, result, 0.0);
    }

}
