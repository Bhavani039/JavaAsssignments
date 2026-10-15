package Daywise_Class_Notes;
public class min_num_max_num {
    static void main(String[] args) {
        int [] a = {10,5,9,12,69,47,58,96};
        int max = a[0];//-1

        for(int i : a){
            if(max < i){
             max = i;
            }
        }
        for(int i = 1 ; i < a.length;i++){
            if(max < a[i]){
                max = i;
            }
        }
        System.out.println(max);
    }
}
