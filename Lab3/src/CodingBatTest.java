import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;
import static org.junit.Test.*;

public class CodingBatTest {


    @org.junit.Test
    public void testMonkeyTrouble() {
        CodingBat cb = new CodingBat();
        assertTrue("t t", cb.monkeyTrouble(true,true));
        assertTrue("false and false", cb.monkeyTrouble(false,false));
        assertFalse("true and false", cb.monkeyTrouble(false,true));
    }

    @org.junit.Test
    public void sumDouble() {
        CodingBat cb = new CodingBat();

        assertEquals(3,cb.sumDouble(1,2));
        assertEquals(5,cb.sumDouble(3,2));
        assertEquals(8,cb.sumDouble(2,2));
    }

    @org.junit.Test
    public void frontAgain() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.frontAgain("edited"));
        assertTrue(cb.frontAgain("ed"));
        assertFalse(cb.frontAgain("edit"));
    }

    @org.junit.Test
    public void zeroFront() {
        CodingBat cb = new CodingBat();
        assertArrayEquals(new int[]{0,0,1,1}, cb.zeroFront(new int[]{1,0,0,1}));
        assertArrayEquals(new int[]{0,0,1,1,1}, cb.zeroFront(new int[]{0,1,1,0,1}));
        assertArrayEquals(new int[]{0,1}, cb.zeroFront(new int[]{1,0}));
    }
}