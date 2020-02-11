package com.alevel.java.nix.zigzagconversion;

import java.util.Arrays;

public class ZigZagConversion {
    public String convert(String str, int rows) {
        String[] strarray = new String[rows];
        if (str == "") {
            throw new IllegalArgumentException("Initial string can't be empty!");
        }
        if (rows == 0)
            return str;
        char[] charArray = str.toCharArray();
        Arrays.fill(strarray, "");
        int n = 0;
        boolean up = true;
        for (int i = 0; i < str.length(); i++) {
            strarray[n] += (charArray[i]);
            if (n == rows - 1)
                up = false;
            else if (n == 0)
                up = true;
            if (up)
                n++;
            else
                n--;
        }
        str = "";
        for (int i = 0; i < rows; i++) {
            str += strarray[i];
        }
        return str;
    }
}