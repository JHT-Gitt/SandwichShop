package org.example;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double regularPrice = 5.45, largePrice = 8.95, loadedRegular = regularPrice + 1, loadedLarge = largePrice + 1.75;
        double price;
        int age;
        String loaded;

        System.out.println("1. Regular Sandwich Price $" + regularPrice);
        System.out.println("2. Large Sandwich Price $" + largePrice);

        System.out.printf("\nWould you like your sandwich loaded [Y/N] ? ");
        loaded = scanner.next();
        if(loaded.equals("Y") || loaded.equals("y")){
            System.out.println("\n---Loaded Sandwich---");
            System.out.println("1. Regular $"+regularPrice +" ➡️ Loaded Regular Sandwich $" + loadedRegular );
            System.out.println("2. Large $"+largePrice +" ➡️ Loaded Large Sandwich $" + loadedLarge );
            System.out.printf("\nWhat size of loaded sandwhich you want? :");
            int size = scanner.nextInt();
            if (size == 1) {
                System.out.printf("\nEnter your age: ");
                age = scanner.nextInt();
                if (age <= 17) {
                    price = loadedRegular - (loadedRegular * .10);
                    System.out.println("\nLoaded Regular sandwich Price: $" + loadedRegular);
                    System.out.println("Age discount %10");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else if (age >= 65) {
                    price = loadedRegular - (loadedRegular * .20);
                    System.out.println("\nLoaded regular sandwich Price: $" + loadedRegular);
                    System.out.println("Age discount %20");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else {
                    System.out.println("\nNo Age Discount");
                    System.out.println("Loaded Regular Total Price: $" + loadedRegular);
                }

            } else if (size == 2) {
                System.out.printf("\nEnter your age: ");
                age = scanner.nextInt();
                if (age <= 17) {
                    price = loadedLarge - (loadedLarge * .10);
                    System.out.println("\nLoaded Large sandwich Price: $" + loadedLarge);
                    System.out.println("Age discount %10");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else if (age >= 65) {
                    price = loadedLarge - (loadedLarge * .20);
                    System.out.println("\nLoaded Large sandwich Price: $" + loadedLarge);
                    System.out.println("Age discount %20");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else {
                    System.out.println("\nNo Age Discount");
                    System.out.println("Loaded Large Sandwich Total Price: $" + loadedLarge);
                }
            } else {
                System.out.println("Invalid input");
            }



        }else if(loaded.equals("N") || loaded.equals("n")) {
            System.out.printf("\nWhat size of sandwich you want ? ");
            int size = scanner.nextInt();
            if (size == 1) {
                System.out.printf("\nEnter your age: ");
                age = scanner.nextInt();
                if (age <= 17) {
                    price = regularPrice - (regularPrice * .10);
                    System.out.println("Regular Price: $" + regularPrice);
                    System.out.println("Age discount %10");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else if (age >= 65) {
                    price = regularPrice - (regularPrice * .20);
                    System.out.println("Regular Price: $" + regularPrice);
                    System.out.println("Age discount %20");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else {
                    System.out.println("No Age Discount");
                    System.out.println("Total Price: $" + regularPrice);
                }

            } else if (size == 2) {
                System.out.printf("\nEnter your age: ");
                age = scanner.nextInt();
                if (age <= 17) {
                    price = largePrice - (largePrice * .10);
                    System.out.println("Large sandwich Price: $" + largePrice);
                    System.out.println("Age discount %10");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else if (age >= 65) {
                    price = largePrice - (largePrice * .20);
                    System.out.println("Large sandwich Price: $" + largePrice);
                    System.out.println("Age discount %20");
                    System.out.printf("Total Price after discount: $%.2f", price);
                } else {
                    System.out.println("No Age Discount");
                    System.out.println("Total Price: $" + largePrice);
                }
            } else {
                System.out.println("Invalid input");
            }
        }else{
            System.out.println("Invalid Input");
        }


        scanner.close();
    }
}