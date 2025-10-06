package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab149_Program {
    public static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt function

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input string ");
        String user_input= scanner.next();

        String reverse_user_input="";

        for(int i=user_input.length()-1;i>=0;i--){
            reverse_user_input+=user_input.charAt(i);
        }

        System.out.println(reverse_user_input);
    }
}
