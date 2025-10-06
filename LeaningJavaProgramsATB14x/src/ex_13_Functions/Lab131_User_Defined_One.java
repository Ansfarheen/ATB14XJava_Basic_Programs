package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        int result= sum_of_two_numbers(3,5);
        int result1= sum_of_two_numbers(4,1);
        System.out.println(result);
        System.out.println(result1);
    }

    static int sum_of_two_numbers(int a , int b){
        return a+b;
    }

    static void sum_of_two_numbers(){
        System.out.println("Hiii, there");
    }
}
