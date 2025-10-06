package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab150_Palindrome {
    public static void main(String[] args) {
        String input= "madaam";
        String reversed="";

        for(int i=input.length()-1;i>=0;i--){
            reversed+=input.charAt(i);
        }

        if (reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
