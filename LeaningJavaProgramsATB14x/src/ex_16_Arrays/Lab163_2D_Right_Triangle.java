package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
