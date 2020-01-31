package com.alevel.java.nix.arraybubblesort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BubbleSortArrayTest {
    private BubbleSortArray bubbleSortArray;
    @BeforeEach
    void setUp()
    {

        bubbleSortArray = new BubbleSortArray();
    }
    @Test
    void bubbleSortArray()
    {
        int[][] actualArray1 = {{4,7,3},{1,9,5},{2,6,8}};
        assertArraysBubble(actualArray1);
        int[][] actualArray2 = {{1,2,3},{5,8,7},{4,6,9}};
        assertArraysBubble(actualArray2);
        int[][] actualArray3 = {{9,5,6},{2,8,7},{4,3,1}};
        assertArraysBubble(actualArray3);
        int[][] actualArray4 = {{1,2,3},{7,8,9},{4,5,6}};
        assertArraysBubble(actualArray4);
        int[][] actualArray5 = {{9,8,7},{6,5,4},{2,3,1}};
        assertArraysBubble(actualArray5);
    }


    private void assertArraysBubble(int[][] actualArray)
    {
        int[][] expectedArray =  {{1,2,3},{4,5,6},{7,8,9}};
        assertArrayEquals(expectedArray,BubbleSortArray.bubbleSortArray(actualArray));

    }



}