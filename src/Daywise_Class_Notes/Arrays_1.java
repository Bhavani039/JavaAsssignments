package Daywise_Class_Notes;

public class Arrays_1 {
    static void main(String[] args) {

        //when u know the value
        String [] stu_name = {"Mahi","Rani","Raju","Ramya"};
        //data_type[] var_anme = {v1,v2,v3.........}
        System.out.println(stu_name); //[Ljava.lang.String;@27716f4

        //adding the ele in to the array
//        var_name[index]
        System.out.println(stu_name[0]);
        System.out.println(stu_name[1]);
        System.out.println(stu_name[2]);
        System.out.println(stu_name[3]);
//        System.out.println(stu_name[4]); Index out bound exp
        int [] a = {12,1,4,5,6,7,8,1,2,7,7,8,1,8,1,5,4,12,4,24,5,2,4,5,1,54,1,4,1,2,5};
        //getting the ele
      /*  System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

       */
        //getting the all ele
        System.out.println(a.length);
        // len = 37
        // si = 0 ; ed = 36
        for(int i = 0; i <= a.length - 1 ; i ++){
            System.out.println(a[i]);//a[37] :no index 37 we have 36
        }
        System.out.println("*************************************");
        for(int i : a){
            System.out.println(i);
        }
        System.out.println(" ***********************************  ");
        for(String i : stu_name){//stu_anme ["mahi","rani","raju"...]
            System.out.println(i);
        }
        System.out.println(a[5]);

        int b = 30;
        int[] c = {12,36,25};//[12,36,25]
    }
}

/*
   i want 100 name

   String s1 = "Mahi";
   String s2 = "Rani";
   .......
   String s100 = "Raju";


 */