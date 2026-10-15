package Daywise_Class_Notes;

public class Prg1_sum_ele {
    // sum of ele arrasy = [10,20,30,40,50,60,78,10,89]
    static void main(String[] args) {
        int [] a = {10,20,30,40,50,60,78,10,89};
        int sum = 0 ;

        for(int i : a){
            sum = sum + i ; // sum = 60  + 40
        }
        System.out.println(sum);
        System.out.println(sum / a.length);
    }
}
// 10 + 0 = 10
// 50 + 45 + 50 + 35 + 40  = avg
// sum of m / sub
//120/5 = avg