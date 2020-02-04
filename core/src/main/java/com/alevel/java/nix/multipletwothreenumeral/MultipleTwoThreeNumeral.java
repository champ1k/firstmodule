package com.alevel.java.nix.multipletwothreenumeral;

public class MultipleTwoThreeNumeral {
    private int initialnumber;

    public int[] foundMultipleNumeral(int initialnumber) {
        if (initialnumber < 0)
            initialnumber *= -1;

        if (initialnumber == 0) {
            throw new IllegalArgumentException("initial number cant be 0");
        }
        int length = 0;
        long temp = 1;
        while (temp <= initialnumber) {
            length++;
            temp *= 10;
        }
        int[] numbertoarray = new int[length];
        for (int i = numbertoarray.length - 1; i >= 0; i--) {
            numbertoarray[i] = initialnumber % 10;
            initialnumber = initialnumber / 10;

        }
        return numbertoarray;
    }

    public String stringMultiple(int[] array) {
        String stringmultiple = "";
        for (int value : array) {
            if (value % 2 == 0 && value % 3 == 0) {
                stringmultiple += "|fizzbuzz|";
            } else if (value % 2 == 0) {
                stringmultiple += "|fizz|";
            } else if (value % 3 == 0) {
                stringmultiple += "|buzz|";
            } else {
                stringmultiple += "|" + value + "|";
            }
        }
        return stringmultiple;
    }
}
