package com.alevel.java.nix.transprotarray;

import java.util.Random;
public class TransportClass {
    public int[][] transportArray()
    {
        int[][] array = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int length = array.length;
        for(int i = 0;i<length;i++)
        {
            for(int j = i+1;j<length;j++)
            {
            int temp = array[i][j];
            array[i][j]= array[j][i];
            array[j][i]=temp;
            }
        }
        return array;
    }
}
