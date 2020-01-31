package com.alevel.java.nix.multiplevaluearray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleValueArrayTest {
    private MultipleValueArray mvarr;
    @BeforeEach
    void setUp()
    {
        mvarr = new MultipleValueArray();
    }
    @Test
    void multipleValueArray()
    {
        int[][] array1 = {{33,51,41,25},{31,23,53,32},{41,21,43,65},{32,31,86,93}};
        int multiplevalue1 = 5;
        int[]multiplearray1 = new int[array1.length*array1.length];
        checkMultipleValue1(array1,multiplearray1,multiplevalue1);

        int[][] array2 = {{103,104,424,25},{31,213,53,32},{41,224,43,125},{302,321,225,117}};
        int multiplevalue2 = 5;
        int[] multiplearray2 = new int[array2.length * array2.length];
        checkMultipleValue2(array2,multiplearray2,multiplevalue2);

        int[][] array3 = {{331,520,431,123},{311,203,421,510},{411,321,405,321},{332,231,142,265}};
        int multiplevalue3 = 5;
        int[]multiplearray3 = new int[array3.length*array3.length];
        checkMultipleValue3(array3,multiplearray3,multiplevalue3);

        int[][] array4 = {{456,653,765,175},{356,475,764,734},{641,346,725,632},{322,215,385,452}};
        int multiplevalue4 = 5;
        int[]multiplearray4 = new int[array4.length*array4.length];
        checkMultipleValue4(array4,multiplearray4,multiplevalue4);

    }

    private void checkMultipleValue1(int[][] array,int[]multiplearray,int multiplevalue)
    {
        int[] multiplearrayexpected = new int[]{25, 65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(multiplearrayexpected,mvarr.multipleValueArray(array,multiplearray,multiplevalue));
    }
    private void checkMultipleValue2(int[][] array,int[]multiplearray,int multiplevalue)
    {
        int[] multiplearrayexpected = new int[]{25, 125, 225, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(multiplearrayexpected,mvarr.multipleValueArray(array,multiplearray,multiplevalue));
    }
    private void checkMultipleValue3(int[][] array,int[]multiplearray,int multiplevalue)
    {
        int[] multiplearrayexpected = new int[]{520, 510, 405, 265, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(multiplearrayexpected,mvarr.multipleValueArray(array,multiplearray,multiplevalue));
    }
    private void checkMultipleValue4(int[][] array,int[]multiplearray,int multiplevalue)
    {
        int[] multiplearrayexpected = new int[]{765, 175,475, 725, 215, 385, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(multiplearrayexpected,mvarr.multipleValueArray(array,multiplearray,multiplevalue));
    }

}