package com.alevel.java.nix.watercontainer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


class WaterContainerTest {
    WaterContainer watercontainer;
    @BeforeEach
    void setUp()
    {
        watercontainer = new  WaterContainer();
    }
    @Test
    void maxArea()
    {
        //test(0,0);
        //test(2,1,2);
        test(49,1,8,6,2,5,4,8,3,7);
        test(4,2,2,4);
        test(20,1,2,3,4,5,6,7,8,9);
        test(20,9,8,7,6,5,4,3,2,1);
    }
    private void test(int expectedArea,int... initialContainer)
    {
        assertEquals(expectedArea,watercontainer.maxArea(initialContainer));
    }
}