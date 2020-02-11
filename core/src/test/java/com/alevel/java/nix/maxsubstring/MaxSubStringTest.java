package com.alevel.java.nix.maxsubstring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class MaxSubStringTest {
    MaxSubString maxSubString;
    @BeforeEach
    void setUp()
    {
        maxSubString = new MaxSubString();
    }
    @Test
    void lengthOfLongestSubstring() {
        //test(0,"");
        test(1,"bbbbbbb");
        test(2,"bbbbabbb");
        test(7,"javanixalevel");
    }
    private void test(int expectedLength,String initialString)
    {
        assertEquals(expectedLength,maxSubString.lengthOfLongestSubstring(initialString));
    }
}