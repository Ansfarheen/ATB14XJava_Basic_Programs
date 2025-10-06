package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        String up1 = args[0];
        int age = Integer.parseInt(up1);

        String result = age <18 ? "Minor" : (age <60) ? "Adult" : "Sr. Citizen";
        System.out.println(result);

    }
}
