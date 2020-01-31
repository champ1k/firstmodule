package com.alevel.java.nix.minmaxinarray;

import java.util.Random;
import java.util.Scanner;

public class FindingMinMaxInArray {
    public int getMaxValue(int[][] arr) {
        int maxValue = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j<arr.length;j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        return maxValue;
    }

    public int getMinValue(int[][] arr) {
        int minValue = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j<arr.length;j++) {
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
            }
        }
        return minValue;
    }

    public void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array lenght:");
        int arraylenght = scanner.nextInt();

        System.out.println("Enter max insert value of array:");
        int randominsertvalues = scanner.nextInt();

        int[][] array = new int [arraylenght][arraylenght];

        for(int i = 0;i<arraylenght;i++)
        {
            for(int j = 0;j<arraylenght;j++)
            {
                array[i][j]= random.nextInt(randominsertvalues)+1;
                System.out.print("\t"+array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(getMaxValue(array));
        System.out.println(getMinValue(array));
    }
}