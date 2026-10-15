package Daywise_Class_Notes;

public class Arrays_2d_ {
    static void main(String[] args) {
        int [] s1 = {10,20,10,10};
        int [] s2 = {25,10,25,10};
        int [] s3 = {14,13,10,20};
        int [] s4 = {20,10,30,20};
        //100 stu:-->
        int [][] stu = {
                {10,20,10,10},
                {25,10,25,10},
                {14,13,10,20},
                {20,10,30,20}
        };
       for(int i = 0 ; i < stu.length ; i ++){ // 0 1
//           System.out.println(stu[i]);
           for(int j = 0 ; j < stu.length ; j++){ // j ; 0 ; j = 1 . 2 . 3 4 5stop
               System.out.print(stu[i][j]);
           }
           System.out.println();// methods :-->
       }
    }
}
