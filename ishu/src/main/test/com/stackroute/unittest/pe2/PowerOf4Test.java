package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumPowerOf4Test {

    NumPowerOf4 obj;
    @Before
    public void setUp() throws Exception {
        NumPowerOf4 obj = new NumPowerOf4();
    }

    @After
    public void tearDown() throws Exception {
        NumPowerOf4 obj = null;
    }

    @Test
    public void checkNumPowerOf4() {
        assertEquals(true,obj.checkNumPowerOf4(16));
        assertEquals(false,obj.checkNumPowerOf4(18));
        assertEquals(true,obj.checkNumPowerOf4(1));
        assertEquals(false,obj.checkNumPowerOf4(0));
    }
}