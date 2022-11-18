package com.fp.fp;

import com.fp.fp.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfessorTest {

    /**
     * Test of getDegreeRate method, of class Professor.
     */
    @Test
    public void testGetDegreeRate() {
        System.out.println("getDegreeRate");
        Professor instance = new ProfessorImpl();
        instance.setDegree("PhD");
        int expResult = 112;
        int result = instance.getDegreeRate();
        assertEquals(expResult, result);
        instance.setDegree("Master");
        expResult = 82;
        result = instance.getDegreeRate();
        assertEquals(expResult, result);
        instance.setDegree("Bachelor");
        expResult = 42;
        result = instance.getDegreeRate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class Professor.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Professor instance = new ProfessorImpl();
        String expResult = "Teacher";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }

    public class ProfessorImpl extends Professor {

        public ProfessorImpl() {
            super(0, "", "", "", "", "", "", "", "", "");
        }

        @Override
        public double ComputePayRoll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
