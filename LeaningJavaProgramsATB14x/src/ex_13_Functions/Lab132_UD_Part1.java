package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        wop_wor_greet();
        String msg= wop_wr_greet();
        System.out.println(msg);
        greet_with_details("ABCD",56,637787);
        int res=sum_of_two_numbers(2,6);
        float fres= sum_of_two_numbers(5.3f,9.8f);
    }


   //Type 1
    static void wop_wor_greet(){
        System.out.println("Hii,there!!!");
    }

    //Type 2
    static String wop_wr_greet(){
        System.out.println("Hii, I am type 2 function");
        return "Hii, How are you!!!";
    }

    // Type 3
    static void greet_with_details(String name,int age, double salary){
        System.out.println("Your name is "+name+ " and age is "+age+" and salary is "+salary);
    }

    //Type 4
    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }

    static float sum_of_two_numbers(float a,float b){
        return a+b;
    }
}
