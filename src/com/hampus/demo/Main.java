package com.hampus.demo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String customerInput;

        boolean foundProduct = false;
        boolean customerIsBuying = true;

        String[] arrayOfProducts = {"Kex", "Choklad", "Bullar"};
        int[][] priceOfProducts = {{5,10,7},{20,25,40}};


        do
        {
            System.out.println("Enter the name of what you would like to buy?");
            System.out.print("| ");
            for (String products : arrayOfProducts)
            {
                System.out.printf(products + " | ");
            }
            System.out.println();

            customerInput = input.nextLine();

            for (int i = 0; i < arrayOfProducts.length; i++)
            {
                foundProduct = false;
                if (customerInput.equals(arrayOfProducts[i]))
                {
                    amountToBuy(i,priceOfProducts,input);
                    foundProduct = true;
                }
                if (foundProduct)
                {
                    break;
                }
            }
            if (!foundProduct){
                System.out.println("Could not find that product");
            }
            System.out.println("Would you like to buy something else?\n1 : YES\n2 : NO");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 2){
                customerIsBuying = false;
                System.out.println("Thanks for shoping with us.");
            }
            else {
                System.out.println("Sure thing, let me present the list once more.");
            }

        }while(customerIsBuying);

    }
    public static void amountToBuy(int position,int[][] productInformation,Scanner input)
    {
        int amount;
        System.out.println("How many would you like to buy");

        System.out.println(productInformation[0][position]);

        amount = input.nextInt();
        input.nextLine();
        int newAmount = productInformation[0][position] - amount;
        productInformation[0][position] = newAmount;
    }
}
