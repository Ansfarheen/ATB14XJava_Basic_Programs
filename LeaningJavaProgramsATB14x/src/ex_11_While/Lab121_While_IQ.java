package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number for factorial program ");
        if(scanner.hasNextInt()){
            int num= scanner.nextInt();
            int fact=1;
            if(num==0){
                fact=1;
                System.out.println("fact = 1");
            }

            if(num<0 || num > Integer.MAX_VALUE){
                System.out.println("Can't calculate the factorial as it is out of bound ");
            }

            int i=1;
            while (i<=num){
                fact*=i;
                i++;
            }
            System.out.println(fact);
        }
        else {
            System.out.println("Enter integer only ");
        }
    }
}
