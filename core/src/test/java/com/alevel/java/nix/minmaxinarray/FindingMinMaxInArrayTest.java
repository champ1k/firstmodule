package com.alevel.java.nix.minmaxinarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingMinMaxInArrayTest {
    private FindingMinMaxInArray fmiarr;
    @BeforeEach
    void setUp()
    {

        fmiarr = new FindingMinMaxInArray();
    }
    @Test
    void getMaxValue() {
        int[][] array1 = {{33,51,41,25},{31,23,53,32},{41,21,43,65},{32,31,86,93}};
        checkMaxValue(93,array1);
        int[][] array2 = {{103,104,424,25},{31,213,53,32},{41,224,43,125},{302,321,222,117}};
        checkMaxValue(424,array2);
        int[][] array3 = {{331,520,431,123},{311,203,421,510},{411,321,403,321},{332,231,142,265}};
        checkMaxValue(520,array3);
        int[][] array4 = {{456,653,765,175},{356,475,764,734},{641,346,724,632},{322,211,387,452}};
        checkMaxValue(765,array4);
    }

    @Test
    void getMinValue() {
        int[][] array1 = {{33,51,41,25},{31,23,53,32},{41,21,43,65},{32,31,86,93}};
        checkMinValue(21,array1);
        int[][] array2 = {{103,104,424,25},{31,213,53,32},{41,224,43,125},{302,321,222,117}};
        checkMinValue(25,array2);
        int[][] array3 = {{331,521,431,123},{311,203,421,513},{411,321,403,321},{332,231,142,265}};
        checkMinValue(142,array3);
        int[][] array4 = {{456,653,765,175},{356,475,764,734},{641,346,724,632},{322,211,387,452}};
        checkMinValue(211,array4);
    }

    private void checkMinValue(int expectedminValue, int array[][])
    {
        assertEquals(expectedminValue,fmiarr.getMinValue(array));
    }
    private void checkMaxValue(int expectedmaxValue, int array[][])
    {
        assertEquals(expectedmaxValue,fmiarr.getMaxValue(array));
    }


}