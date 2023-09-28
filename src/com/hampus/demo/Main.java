package com.hampus.demo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] listOfNumbers = {10, 20, 30, 40, 50};
        divisionByZero(23);

        for(int i = 0; i < listOfNumbers.length; i++)
        {
            System.out.println(listOfNumbers[i] + listOfNumbers[i]);
        }
    }

    public static void divisionByZero(int i)
    {
        try
        {
            System.out.println(i / 0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Nope can't divide that");
        }
    }
}
