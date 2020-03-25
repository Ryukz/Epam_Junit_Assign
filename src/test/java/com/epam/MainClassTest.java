package com.epam;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class MainClassTest
{
    /**
     * Rigorous Test :-)
     * 1. AB => B
     * 2. BACD => BCD
     * 3. A =>
     * 4. AACA => CA
     * 5. BCAA => BCAA
     * 6. " " => " "
     */
    private RemoveFirstTwoChars removeFirstTwoChars=new RemoveFirstTwoChars();

    @Test
    public void test1case()
    {
        String result=removeFirstTwoChars.remove("AB");
       // System.out.println(result);
        assertEquals("B",result);
    }
    @Test
    public void test2case()
    {
        String result=removeFirstTwoChars.remove("BACD");
        assertEquals("BCD",result);
    }
    @Test
    public void test3case()
    {
        String result=removeFirstTwoChars.remove("A");
        assertEquals("",result);
    }
    @Test
    public void test4case()
    {
        String result=removeFirstTwoChars.remove("AACA");
        assertEquals("CA",result);
    }
    @Test
    public void test5case()
    {
        String result=removeFirstTwoChars.remove("BCAA");
        assertEquals("BCAA",result);
    }
    @Test
    public void test6case()
    {
        String result=removeFirstTwoChars.remove("");
        assertEquals("",result);
    }




}
