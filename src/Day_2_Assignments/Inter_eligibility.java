package Day_2_Assignments;

import java.util.Scanner;

public class Inter_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        if (age >= 18 && income >= 25000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
