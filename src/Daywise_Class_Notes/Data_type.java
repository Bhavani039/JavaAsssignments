package Daywise_Class_Notes;

public class Data_type {
    public static void main(String[] args){
        //num
//        String q[] = {"hello","hai"};
//        main(q);
        byte a = -128; // 8bits
        byte b = 127;
       // byte c = 128;
        short c = -32768;
        short d = 32767;

        //int
        int e = -2147483648;
        int f = 2147483647;

        //long
        long g = -9223372036854775808L;//integer number too large
        long h = 9223372036854775807l;
//        note :-->if value crossing int range then l is man
        // if not values is not crossing int range l is opn
        long j = 134645;
       // num :-->int

        byte emg = 100;
        short year = 2006;
        int pin_code = 560060;
        long ph = 9234567899L;

        //decimal
        float i = 45.26F; //incompatible types: possible lossy conversion from double to float
        double k = 45896325.23;

        // char
        char l = 'a';
        char o = '1';
        char p = ' ';

        //boolean
        boolean is_java = true;
        boolean is_python = false;

        //collection of char
        String s = "Hello i am java";
        String r = "true";
        String w = "1243";

    }
}
