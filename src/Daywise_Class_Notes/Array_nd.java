package Daywise_Class_Notes;

public class Array_nd {
    static void main(String[] args) {
        int [][][] s1 = {

                {{12,60},{15,90},{20,30},{10,93}} ,
                {{12,36},{12,63},{15,36},{15,96}} ,
                {{12,25},{14,25},{14,85},{12,56}}

        };

        int[][][] s2 = new int[2][2][2];
        s2[0][0][0] = 25;
        s2[0][0][1] = 25;
        s2[0][1][0] = 52;
        s2[0][1][1] = 36;

        for(int i = 0; i < 2 ; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2 ; k++){ // %
                    System.out.println(s2[i][j][k]);
                }
            }
        }
        System.out.println(" +++++++++++++++++++++++++++++++   ");

        for(int [][] i : s1){
            for(int [] j : i){
                for(int k : j){
                    System.out.println(k);
                }
            }
        }

    }
}
