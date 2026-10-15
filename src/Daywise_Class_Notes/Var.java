package Daywise_Class_Notes;

public class Var {

    static void main(String[] args) {
    /*
        3steps :-->
      ______________________________________________________________________
        1. dec :-->
        a :--> is var , b  is  a var , name :-- var , pin bar ......
        Syntax:-->
        data_type var_name;
     */
        int a,b; //int a ; int b ;
        String name ;
        double pin;

        /*
           2step:-->intializ
           a = 56 ; b = 96 ; name = "Rani" ....
   ________________________________________________________
         */
         a = 56;
         b = 96;
         name = "Rani";
         /* step 3:--
         _______________________________________________________________
         System.out.println(a);
         a + b;
            utilizing :-->
          */
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
//        __________________________________________________________________
        /*
             **************  imp note ********************
         */
//          u can dec+ini at a time
        int x = 50;

//        but  we can't dec+ini+utili
//        System.out.println(int y = 96;); error
//        System.out.println(int y = 96 );

       //var we can dec only once
       int y;
//       int y; error
        // but u can re-ini
         y = 96;
         y = 109;

         /*   for (int i = 1; i <= 10; i++)
            Local var without init we can utilize
            becous it don't have the def value
          */

        int u;
//        System.out.println(u); error


























    }
}
