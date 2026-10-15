package Daywise_Class_Notes;

public class flow_con {

    static void main(String[] args) {

        int num = -89; // i want check give num is +ve or -ve
        if(num > 0){ // 45 > 0 ;true
            System.out.println("give num is +ve");
        }
      //  num = -89;
       if(num < 0) { // -89 < 0 T
           System.out.println("give num is -ve");
       }
       if(num == 0){
           System.out.println("give num is 0");
       }
       num = 0;
        System.out.println(num > 0 ? "+ve" : "-ve");
    }
}
/*
 if condition is true then it i will exc if block otherwise it not exc if block
    Syntax:--
    if(condition){
       //set of line s of coode
    }
 /ex - flow
 if(true){
    // it exg the if block
 }

 if(fasle){
    //it not ex if block
 }
 */