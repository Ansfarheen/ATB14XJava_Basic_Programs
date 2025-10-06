package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7 ");
        if(scanner.hasNextInt()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter a number between 1 to 7...");
            }
        }
        else {
            System.out.println("Enter integer you Fool!!");
        }
    }
}
