package Day_2_Assignments;

import java.util.Scanner;

public class Product_tax {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double subtotal = price * quantity;
            double tax = subtotal * 18 / 100;
            double finalTotal = subtotal + tax;

            System.out.println("\n----- Product Bill -----");
            System.out.println("Product Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("18%% Tax: %.2f%n", tax);
            System.out.printf("Final Total: %.2f%n", finalTotal);

            sc.close();
        }
    }

//Subtotal=Price×Quantity
//tax = subtotal * 18/100
//Final Total=Subtotal+Tax