package ex_16_Arrays;

import java.util.Scanner;

public class Right_Aligned_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n -i -1); j++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
