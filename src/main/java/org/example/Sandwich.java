package org.example;
import java.util.*;

public class Sandwich {
    Scanner scanner = new Scanner(System.in);
    double price1 = 5.45, price2 = 8.95, price3 = price1 + 1, price4 = price2 + 1.75, totalPrice;
    int age, size;
    String isLoaded;

    public void sandwichInfo1(){
        System.out.println("1. Regular Sandwich Price $" + price1);
        System.out.println("2. Large Sandwich Price $" + price2);
    }
    public void sandwichInfo2(){
        System.out.println("\n---Loaded Sandwich---");
        System.out.println("1. Loaded Regular Sandwich Price $" + price3);
        System.out.println("2. Loaded Large Sandwich Price $" + price4);
        System.out.println("---------------------");
    }
    public void loadedSize(){
        System.out.printf("\nWhat size of loaded sandwich you want? :");
        size = scanner.nextInt();
        if (size == 1) {
                System.out.printf("\nEnter your age: ");
                age = scanner.nextInt();
                if (age <= 17) {
                    totalPrice = price3 - (price3 * .10);
                    System.out.println("\nLoaded Regular sandwich Price: $" + price3);
                    System.out.println("Age discount %10");
                    System.out.printf("Total Price after discount: $%.2f", totalPrice);
                } else if (age >= 65) {
                    totalPrice = price3 - (price3 * .20);
                    System.out.println("\nLoaded regular sandwich Price: $" + price3);
                    System.out.println("Age discount %20");
                    System.out.printf("Total Price after discount: $%.2f", totalPrice);
                } else {
                    System.out.println("\nNo Age Discount");
                    System.out.println("Loaded Regular Total Price: $" + price3);
                }

            } else if (size == 2) {
                System.out.printf("\nEnter your age: ");
                age = scanner.nextInt();
                if (age <= 17) {
                    totalPrice = price4 - (price4 * .10);
                    System.out.println("\nLoaded Large sandwich Price: $" + price4);
                    System.out.println("Age discount %10");
                    System.out.printf("Total Price after discount: $%.2f", totalPrice);
                } else if (age >= 65) {
                    totalPrice = price4 - (price4 * .20);
                    System.out.println("\nLoaded Large sandwich Price: $" + price4);
                    System.out.println("Age discount %20");
                    System.out.printf("Total Price after discount: $%.2f", totalPrice);
                } else {
                    System.out.println("\nNo Age Discount");
                    System.out.println("Loaded Large Sandwich Total Price: $" + price4);
                }
            } else {
                System.out.println("Invalid input");
            }

    }
    public void regularPrice() {
        System.out.printf("\nWhat size of sandwich you want ? ");
        int size = scanner.nextInt();
        if (size == 1) {
            System.out.printf("\nEnter your age: ");
            age = scanner.nextInt();
            if (age <= 17) {
                totalPrice = price1 - (price1 * .10);
                System.out.println("Regular Price: $" + price1);
                System.out.println("Age discount %10");
                System.out.printf("Total Price after discount: $%.2f", totalPrice);
            } else if (age >= 65) {
                totalPrice = price1 - (price1 * .20);
                System.out.println("Regular Price: $" + price1);
                System.out.println("Age discount %20");
                System.out.printf("Total Price after discount: $%.2f", totalPrice);
            } else {
                System.out.println("No Age Discount");
                System.out.println("Total Price: $" + price1);
            }

        } else if (size == 2) {
            System.out.printf("\nEnter your age: ");
            age = scanner.nextInt();
            if (age <= 17) {
                totalPrice = price2 - (price2 * .10);
                System.out.println("Large sandwich Price: $" + price2);
                System.out.println("Age discount %10");
                System.out.printf("Total Price after discount: $%.2f", totalPrice);
            } else if (age >= 65) {
                totalPrice = price2 - (price2 * .20);
                System.out.println("Large sandwich Price: $" + price2);
                System.out.println("Age discount %20");
                System.out.printf("Total Price after discount: $%.2f", totalPrice);
            } else {
                System.out.println("No Age Discount");
                System.out.println("Total Price: $" + price2);
            }
        }
    }


}
