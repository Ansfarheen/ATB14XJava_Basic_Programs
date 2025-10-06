package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
//        int a=10;
//        System.out.println(++a);

        // Post Increment
        int a_post=10;
        int b= a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT Table
        // LNo. /  a_post  /  b
        //  9   / 10       / NA
        //  10  / 11       / 10
    }
}
