package Daywise_Class_Notes;

public class Arrays_2 {
    static void main(String[] args) {
        int [] a = new int[10];
//      data_type [] var_anem = new data_type[size]

        // u can add ele
        //var_name[index_num] = value;

        a[0] = 45;
        a[1] = 35;
        a[5] = 39;

        // getting the ele
        for(int i : a){
            System.out.println(i);
        }

        // add data arrays(100)
        /*
           square of num
           1 to 100
           3 table
         */
        int [] s = new int[20];
        //adding the ele
        for(int i = 0 ; i < s.length ; i++){
            s[i] = i * i;
        }

        //getting the ele
        for(int i : s){
            System.out.println(i);
        }

    }
}
