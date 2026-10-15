package Daywise_Class_Notes;

public class Operators {
    static void main(String[] args) {
        //  +,-,*,/,%
        int a = 35;
        int b = 2;
        System.out.println(a + b); // 35 + 2 = 37
        System.out.println(a - b);// 35 - 2 = 33
        System.out.println(a * b);// 35 * 2 = 70
        System.out.println(a / b);// 35 / 2 = 17 qu
        System.out.println(a % b); // 35 % 2 = 1 rem
       System.out.println(35.0/2); // 17.5
        int y = 12-56/25%5*2+5; // Var   ?
        // 12-2%5*2+5
        // 12-2*2+5
        // 12-4+5
        // 13
        System.out.println(y);//
        // inc ++ , dec --
        /*
            ++ two types
            1.pre
               ex :-- > ++a
            2.post
               ex :--> a++
         */
       a = 20;
       b = 10;

      System.out.println(++a);//21
      System.out.println(b++);// 10
       System.out.println(a);// 20+1 =21
       System.out.println(b); // 10+1 = 11

//        System.out.println(5++);
        // a = 21 + 1 = 22
        // b = 11 + 1 = 12
        y = a ++ + ++b;
        //y = 21 + 12 = 33
        System.out.println(y); // 33
        // a = 22; 22+1=23
        // b = 12;12+1=13
        y = ++a + ++ b;
        //y = 23+13
        System.out.println(y);// 36

        a = 6; // a + 1 = 7
        b = 7;
        y = a ++ + a++;
        //y =  6 +  7
        System.out.println(y);

        a = 5; // 5 + 1 = 6
        b = 9; // 9 + 1 = 10
        y = ++a + ++b;
        //y = 6 + 10
        System.out.println(y); // 16


        a = 5; // 5 + 1 = 6
        b = 9; // 9 +1 = 10
        y = a++ + b++ + a;
        //y = 5 + 9 + 6
        System.out.println(y);


        a = 9;//9+1 = 10 + 1= 11 + 1= 12 + 1 = 13
        y = a ++ + ++ a + ++ a+ ++a + a++;
        // y = 9 +  11 + 12 + 13 + 13
        System.out.println(y); // 54
        System.out.println(a); // 14

        a = 50;// 50 -1 = 49 - 1 = 48 + 1 = 49 -1= 48
        y = a -- + --a + ++a + --a;
        // 50 + 48 +  49 + 48
        System.out.println(y); // 195

        a = 5;
        b = 23;
        System.out.println(a < b); // 5 < 23 //yes true
        System.out.println(a > b); // 5 > 23 //no False
        System.out.println(a <= b); // 5 <= 23 ; yes true
        System.out.println(a >= b); // 5 >= 23 ; false
        System.out.println(a == b); // 5 == 23 ; no false
        System.out.println(a != b); // 5 != 23 ;yes true

        // y = a + a
        a = 50; // = , += , -=, *= ,/= , %=
        System.out.println(a);

        a += 5; //a = a + 5 ;a = 50 + 5 ;a = 55
        System.out.println(a);

        a -= 5;// a = a - 5 ; a = 55 - 5 ; a = 50
        System.out.println(a);

        a *= 5; //a = a * 5 ; a = 50 * 5 = a = 250
        System.out.println(a);

        a /= 5;// a = a / 5; a = 250 / 5 = 50
        System.out.println(a);

        a %= 5;// a = a % 5; a = 50%5 = 0
        System.out.println(a);

        int num = 250; // 250 / 5 = 50 / 5 ; 25 / 5 ; 5 / 5 ; 1 / 5 ; 0 stop


        // &&  || !

        num = 15; // check give num is div by 3 and Div by 5 or not

        boolean is_num_div_3 = num % 3 == 0;
        boolean is_num_div_5 = num % 5 == 0;
        boolean is_num_div_with_3_and_5 = is_num_div_3 && is_num_div_5;

        /* case1 :-- num 15
       is_num_3     num % 3 == 0     is_num_5 num % 5 == 0
                     15 % 3 == 0     15 % 3 == 0
                       0 == 0   T   &&   0  == 0 T         final :-- true
          case 2:-- num 5
                  num % 3 == 0
                   5 % 3 == 0                              final :--False
                    3  == 0   F  &&

          case 3:-- num 9
               num % 3 == 0         num % 5 ==0
               9 % 3 == 0            9 % 5 == 0
                 0 == 0    T     &&   4 == 0  F           final :--False
          case 4 :-- num = 4
              num % 3 == 0
               4 % 3 == 0
                1 == 0  F   &&                             final  False



         */
        System.out.println("num is div by 3 and 5 " + is_num_div_with_3_and_5);
        System.out.println(num % 3 == 0 && num % 5 == 0);//true

        // ||  : num div 3 or 5
        num = 9;
        System.out.println(num % 3 == 0 || num % 5 == 0);
        /*
           case:--> num = 9                                 final :-- True
           num % 3 == 0  ||  num % 5 == 0
           9 % 3 == 0        9 % 5 == 0
            0 == 0   T   ||   4  == 0   F

           case num = 10
             num % 3 == 0       num % 5 == 0
             10 % 3 == 0         10 % 5 == 0
               1 == 0   F  ||    0 == 0   T                 final true

            case num 8
              num % 3 == 0       num % 5 == 0
                8 % 3 == 0        8% 5 == 0
                  2 == 0   f       3 == 0  f                   final false

          case num :-- 15
             num % 3 == 0        15 % 5 == 0
              15 % 3  == 0        0   == 0  T              final true
                0  == 0  T

         */

        System.out.println(! true);  // false
        System.out.println(! false);  // true


        System.out.println(num % 3 == 0 && num % 5 == 0 ? "given num is div by 3 and 5" : "given num is not div 3 and 5"); //t/f :--given num is not div 3 and 5
        // ?:
        a = 6;
        b = 7;
        System.out.println(a > b ? "a > b" : "a < b");
        // 6 > 7 F ; a < b
        //a = 9 ,b = 6
        // 9 > 6 : a > b


        System.out.println(a > b ? a ++ : --b);

        System.out.println(45 + "30" + 90);// "4530" + 90 = 453090
        System.out.println(45 + 30 + "20");//7520
        System.out.println("30" + 10 + 20);//"3010" + 20 = 301020
        System.out.println('a' + 1);//a1 // 97 + 1 = 98  (a = )(A)
        //bitwise :-->  15 min
         a = 5;
         b = 3;
         System.out.println(a & b); //1
         System.out.println(a | b); // 7
         System.out.println(a ^ b);//6
         a = 50;
         System.out.println(a >> 1); // 25
         System.out.println(a << 1); // 100 how

         System.out.println(25 >> 2); // 25,12,6
         System.out.println(25 << 2); // 25 50 100

        // key word :-- 5min
        //var :-->

//        System.out.println(25.56 & 2);


//      a = 45;
//      b = 25;
      System.out.println(a == b);//true /false
      String msg =  a == b ? "a == b":"a != b";
      System.out.println(msg);
//      a < 0 ? "-ve num" : "+ num";
//      a > 0 ? "+ve num" : "-ve num"








































































































    }
}
