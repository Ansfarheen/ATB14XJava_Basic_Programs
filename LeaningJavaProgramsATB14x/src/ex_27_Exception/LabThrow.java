package ex_27_Exception;

import java.util.Scanner;

public class LabThrow {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        if(!scanner.next().equalsIgnoreCase("pramod")){
            throw new CustomException("Chal ja yahan se");
            //throw new ArithmeticException("hehehe");

        }
    }
}
