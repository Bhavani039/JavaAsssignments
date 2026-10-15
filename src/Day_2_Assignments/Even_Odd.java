package Day_2_Assignments;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:  ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println( number  +  "Is an even number");
        }
        else{
            System.out.println( number  +  "Is an odd number");
            scanner.close();

        }
    }
}
