package com.alevel.java.nix.transprotarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportClassTest {
    private TransportClass tc;
    @BeforeEach
    void setup()
    {
        tc = new TransportClass();
    }
    @Test
    void transportArray() {
        int[][] expectedarray = {{0,3,6},{1,4,7},{2,5,8}};
        test(expectedarray);
    }
    private void test(int[][]expected)
    {
        assertArrayEquals(expected,tc.transportArray());
    }
}