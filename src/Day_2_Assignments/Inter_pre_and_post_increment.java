package Day_2_Assignments;

public class Inter_pre_and_post_increment {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;

        int c = 8;
        int d = a--;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
