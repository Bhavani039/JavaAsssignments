package Daywise_Class_Notes;

public class Arrays_2d_1 {
    static void main(String[] args) {
        // we create object
        // insert the data
        // extract the data
        int rows = 5;
        int cols = 6;
        int [][] d1 = new int[rows][cols]; // 4 row  5 col
        d1[0][0] = 45;
        d1[0][1] = 35;
        d1[0][2] = 96;
        d1[0][3] = 95;
        d1[0][4] = 96;
        d1[0][5] = 56;
        d1[2][0] = 45;
        d1[2][1] = 35;
        d1[2][2] = 96;
        d1[2][3] = 95;
        d1[2][4] = 96;
        // get the data
        System.out.println(d1[0][0]);
        System.out.println(d1[0][1]);
        System.out.println(d1[0][2]);
        System.out.println(d1[0][3]);
        System.out.println(d1[0][4]);
        System.out.println(d1[0][5]);
//        System.out.println(d1[0][6]); //.ArrayIndexOutOfBoundsException
        System.out.println("hello");


        //get the ele
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 6 ; j++) {
                System.out.print(d1[i][j] + "\t");
            }
            System.out.println();
        }
        //
        for( int [] i : d1){
            for(int j : i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }

    }}

