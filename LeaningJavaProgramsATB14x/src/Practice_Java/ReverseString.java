package Practice_Java;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input string ");
        String str= scanner.next();

        int i= str.length()-1;
        String reversed="";
        while(i>=0){
            reversed+=str.charAt(i);
            i--;
        }
        System.out.println(reversed);
    }
}
