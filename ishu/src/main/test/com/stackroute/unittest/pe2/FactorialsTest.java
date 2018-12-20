package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFactorialsTest {
    CalculateFactorials obj;
    @Before
    public void setUp() throws Exception {
        CalculateFactorials obj = new CalculateFactorials();
    }

    @After
    public void tearDown() throws Exception {
        CalculateFactorials obj;
    }

    @Test
    public void intCalculateFactorials() {
        assertEquals(1,obj.intCalculateFactorials(0));
        assertEquals(24,obj.intCalculateFactorials(4));
        assertEquals(1,obj.intCalculateFactorials(1));
        assertEquals(120,obj.intCalculateFactorials(5));
    }

    @Test
    public void longCalculateFactorials() {
        assertEquals(720,obj.longCalculateFactorials(6));
        assertEquals(39916800,obj.longCalculateFactorials(11));
        assertEquals(362880,obj.longCalculateFactorials(9));
    }
}