package Practice_Java;

import java.util.Scanner;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input string ");
        String str= scanner.nextLine();

        String[] splitted= str.split(" ");
        System.out.println("The first letter of each word is ");
        for (String split:splitted) {
            System.out.print(split.charAt(0)+ " ");
        }
    }
}
