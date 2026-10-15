package Daywise_Class_Notes;

public class Programs_ {
    static int num_of_digits(int num){
        int count = 0;
        for(int i = num;i > 0; i  = i / 10){
            count++;
        }
        System.out.println(count);
        return count;
    }
    static int power_of_num(int p, int num){
        int power = 1;
        for(int i = 1 ; i <= p ; i++){
            power = power * num ; // p = 9 * 3 = 27
        }
        return power;
    }
    static void main(String[] args) {
        // Armstrong :--> 1  2  3
        // num of dig
        // num = 123  :-- dig 3
        // 1 ^ 3 + 2 ^ 3 + 3 ^ 3 == 123 Then Armstrong
//        153:-->
        // 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 1 + 125 + 27  = 153

        int num = 1534;
        int ov =  0;
        int temp = num;
        while(temp > 0){ //
            int l = temp % 10; //geting the lastnum
            temp = temp / 10; //removing the lastnum
            ov = ov + power_of_num(num_of_digits(num) , l);
        }

    if(num == ov){
        System.out.println("Armstrong");
    }
    else{
        System.out.println("it not Armstrong");
    }

    }
}
