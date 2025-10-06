package ex_06_Ternary_Operator;

public class Lab_067_TO_Three_Max {
    public static void main(String[] args) {
        int n1= 2 , n2=9 , n3= 11;

        int max = (n1>n2)? (n1>n3)? n1: n3 : (n2>n3) ? n2 : n3;

        System.out.printf("The max is %d",max);
    }
}
