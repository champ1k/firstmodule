package com.alevel.java.nix.multiplevaluearray;

import java.util.Random;
import java.util.Scanner;

public class MultipleValueArray {

    int[] multipleValueArray(int[][] array,int[] multiplearray,int multiplevalue )
    {
        int counter= 0;
        for(int i = 0;i<array.length;i++)
        {
            for(int j = 0;j<array.length;j++)
            {
                    if (array[i][j] % multiplevalue == 0)
                    {
                        multiplearray[counter] = array[i][j];
                        counter++;
                    }
            }
        }
        return multiplearray;
    }

    static void printArrays(int[][] initialarray,int[] multiplearray)
    {
        for(int i = 0;i<initialarray.length;i++)
        {
            for(int j = 0;j<initialarray.length;j++)
            {
                System.out.print("\t"+initialarray[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0;i<multiplearray.length;i++)
        {
            System.out.print("\t"+multiplearray[i]);
        }
    }


    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array lenght:");
        int arraylenght = scanner.nextInt();

        System.out.println("Enter max insert value of array:");
        int randominsertvalues = scanner.nextInt();

        int[][] array = new int [arraylenght][arraylenght];

        int[] mulriplearray = new int[arraylenght*arraylenght];
        for(int i = 0;i<arraylenght;i++)
        {
            for(int j = 0;j<arraylenght;j++)
            {
                array[i][j]= random.nextInt(randominsertvalues)+1;

            }
        }


        printArrays(array,mulriplearray);
    }
}
