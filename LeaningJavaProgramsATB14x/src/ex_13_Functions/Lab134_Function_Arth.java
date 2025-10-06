package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = readInt(scanner,"Enter first number ");
        int b = readInt(scanner,"Enter second number ");

        int result_sum= sum(a,b);
        int result_sub= sub(a,b);
        int result_mul=mul(a,b);
        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        int result_div=div(a,b);



        System.out.println(result_div);
    }

    static int readInt(Scanner scanner,String prompt){
        System.out.println(prompt);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            System.out.println("Enter integer only");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a,int b){
        return a+b;
    }

    static int sub(int a,int b){
        return a-b;
    }

    static int mul(int a,int b){
        return a*b;
    }

    static int div(int a,int b){
        if(b==0){
            throw new ArithmeticException("Division by zero not allowed ");
        }
        return a/b;
    }



}
