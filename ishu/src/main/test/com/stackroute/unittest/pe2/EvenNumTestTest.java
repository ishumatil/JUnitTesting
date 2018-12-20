package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsEvenNumTest {

    EvenNumTest obj;
    @Before
    public void setUp() throws Exception {
        IsEvenNumTest obj = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
       IsEvenNumTest obj = null;
    }

    @Test
    public void IsEven() {
        assertEquals(true,obj.isEven(8));
        assertEquals(false,obj.isEven(37));
        assertEquals(true,obj.isEven(0));
        assertEquals(false,obj.isEven(837));
    }
}