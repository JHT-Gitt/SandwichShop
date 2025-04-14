package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double regularPrice = 5.45, largePrice = 8.95;
        double price;
        int age;

        System.out.println("1. Regular Sandwich Price $" + regularPrice);
        System.out.println("2. Large Sandwich Price $" + largePrice);

        System.out.printf("\nWhat siz of sandwich you want ? ");
        int size = scanner.nextInt();
        if (size == 1){
            System.out.printf("\nEnter your age: ");
            age = scanner.nextInt();
            if (age <= 17){
                price = regularPrice - (regularPrice * .10);
                System.out.println("Regular Price: $" + regularPrice);
                System.out.println("Age discount %10");
                System.out.printf("Price after discount: $%.2f", price);
            }else if(age >= 65){
                price = regularPrice - (regularPrice * .20);
                System.out.println("Regular Price: $" + regularPrice);
                System.out.println("Age discount %20");
                System.out.printf("Price after discount: $%.2f", price);
            }else{
                System.out.println("No Age Discount");
                System.out.println("Total Price: $" +regularPrice);
            }

        }else if(size == 2){
            System.out.printf("\nEnter your age: ");
            age = scanner.nextInt();
            if (age <= 17){
                price = largePrice - (largePrice * .10);
                System.out.println("Large sandwich Price: $" + largePrice);
                System.out.println("Age discount %10");
                System.out.printf("Price after discount: $%.2f", price);
            }else if(age >= 65){
                price = largePrice - (largePrice * .20);
                System.out.println("Large sandwich Price: $" + largePrice);
                System.out.println("Age discount %20");
                System.out.printf("Price after discount: $%.2f", price);
            }else{
                System.out.println("No Age Discount");
                System.out.println("Total Price: $" +largePrice);
            }
        }else{
            System.out.println("Invalid input");
        }



        scanner.close();
    }
}