package Daywise_Class_Notes;

import java.util.Scanner;

public class Cond {

    static void main(String[] args) throws Exception {
        // if user enter the upi pin 3 inc then s/m lock the upi
        /*
           upi = 1234
           if enter  1234 open

           upi = 4567  error
           upi = 1234 open

           upi = 4568 erro
           upi = 8955 error
           upi = 1234  open

           upi = 1245
           upi = 8569
           upi = 45852 lock

         */
        Scanner sc = new Scanner(System.in);

        int count = 3;
        while(count > 0){
            System.out.println("pls enter the upi");
            int upi = sc.nextInt();
            if(upi == 1234){
                System.out.println("open");
                break;
            }
            else{
                count --;
            }
        }
        if(count == 0){
            System.out.println("upi lock");
        }





//        for(int i = 0 ; i <= 13 ; i ++){
//            if(i % 3 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        for(int i = 0 ; i <= 13 ; i ++){
//            if(i % 3 != 0) {
//                System.out.println(i);
//            }
//        }
//
//        int i = 1;
//        while(i <= 13){
//            if(i % 3 != 0){
//                System.out.println(i);
//                i++;
//            }
//        } //i = 15
//        int  i = 1;
//        do {
//            if (i % 3 != 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//        while(i <= 13);
//


    }
    }
      // 1 to 10
//        for(int i = 1; i <= 10 ; i++){
//           System.out.println(i);
//        }
        //using while loop
 /*       int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println(" **************************    ");
        i = 1;
        do{
            System.out.println(i);
            i++; // 11+1 = 12
        }while(i <= 5);
    }
*/
    // i want to print 1 to 10 even using while loop
  /*
    sp :-- > 1
    ep :-> 10

    for(int i = 1; i <= 10 ; i++){
      s.o.p(i)
    }

   */





