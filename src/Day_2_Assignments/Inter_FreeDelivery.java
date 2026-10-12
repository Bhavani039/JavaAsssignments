package Day_2_Assignments;

import java.util.Scanner;

public class Inter_FreeDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();

        String delivery = (amount >= 999)
                ? "Free Delivery"
                : "Delivery Charges Applicable";

        System.out.println(delivery);

        sc.close();
    }
}
