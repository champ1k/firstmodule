package com.alevel.java.nix.multipletwothreenumeral;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class MultipleTwoThreeNumeralTest {
    private MultipleTwoThreeNumeral mttn;
    private MultipleTwoThreeNumeral mttnTest;
    @BeforeEach
    void setUp()
    {
        mttn = new MultipleTwoThreeNumeral();
        mttnTest = new MultipleTwoThreeNumeral();
    }
    @Test
    void foundMultipleNumeral() {
        test(1235,1235);
        test(2312235,2312235);
        test(-5123512,-5123512);
        test(987654321,987654321);
        //test(0,0);
        test(-987654321,-987654321);
        test(1,1);
    }
    private void test(int initial,int expected)
    {
        assertEquals(mttn.stringMultiple(FoundMultipleNumeral(initial)),mttnTest.stringMultiple(testFoundMultipleNumeral(expected)));
    }
    private int[] FoundMultipleNumeral(int testinitial)
    {
       return mttn.foundMultipleNumeral(testinitial);
    }
    private int[] testFoundMultipleNumeral(int testinitial)
    {
        return mttnTest.foundMultipleNumeral(testinitial);
    }


}