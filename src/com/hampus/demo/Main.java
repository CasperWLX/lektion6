package com.hampus.demo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {0, 100, 1000};


        try
        {
            for (int i = 0; i < numbers.length; i++)
            {
                System.out.println(numbers[i] - numbers[i+1]);
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
            System.out.println("Listan är slut");
            aioobe.printStackTrace();
        }
    }
}
