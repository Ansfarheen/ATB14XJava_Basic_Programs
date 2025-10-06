package Practice_Java;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input string ");
        String str= scanner.nextLine();

        String[] splitted= str.split(" ");

        System.out.println("Total number of words are "+splitted.length);
    }
}
