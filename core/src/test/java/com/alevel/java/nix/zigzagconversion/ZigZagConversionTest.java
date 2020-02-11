package com.alevel.java.nix.zigzagconversion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {
    ZigZagConversion zigZagConversion;
    @BeforeEach
    void setUp()
    {
        zigZagConversion = new ZigZagConversion();
    }
    @Test
    void convert()
    {
        //test("","",0);
        test("lol","lol",0);
        test("PAHNAPLSIIGYIR","PAYPALISHIRING",3);
        test("PINALSIGYAHRPI","PAYPALISHIRING",4);
        test("JLAAEVXVAIENL","JAVANIXALEVEL",5);
    }
    private void test(String exepectedString,String initialString,int rows)
    {
        assertEquals(exepectedString,zigZagConversion.convert(initialString,rows));
    }
}