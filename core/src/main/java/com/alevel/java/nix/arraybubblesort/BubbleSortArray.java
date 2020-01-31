package com.alevel.java.nix.arraybubblesort;

import javafx.scene.control.RadioMenuItem;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortArray {

    public static int[][] bubbleSortArray(int[][] arr)
    {
        for(int k = 0; k<arr.length;k++)
        {
            for (int l = 0; l < arr.length; l++)
            {
                for (int i = 0; i < arr.length; i++)
                {
                    for(int j = 0;j < arr.length-1;j++)
                    {

                        if(j == 0 && i != 0 && arr[i][j] < arr[i-1][arr.length - 1])
                        {
                            int temp = arr[i][j];
                            arr[i][j] = arr[i-1][arr.length - 1];
                            arr[i-1][arr.length - 1] = temp;
                        }
                        else
                        {
                            if ( arr[i][j] > arr[i][j+1])
                            {

                                    int temp = arr[i][j];
                                    arr[i][j] = arr[i][j+1];
                                    arr[i][j+1] = temp;
                            }
                        }
                    }
                }
            }
        }
        return arr;
    }

    public static void printSortedArray(int[][] arr)
    {
        System.out.println("Sorted array: ");
        for (int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                System.out.print("\t"+arr[i][j] + " ");
            }
            System.out.println();
        }
    }

     public static int[][] initialRandomArray()
    {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array lenght:");
        int arraylength = scanner.nextInt();

        System.out.println("Enter max insert value of array:");
        int randominsertvalues = scanner.nextInt();

        int[][] arr = new int [arraylength][arraylength];
        System.out.println("Initial array: ");
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                arr[i][j]= random.nextInt(randominsertvalues)+1;
                System.out.print("\t"+arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        printSortedArray(bubbleSortArray(initialRandomArray()));
    }
}
