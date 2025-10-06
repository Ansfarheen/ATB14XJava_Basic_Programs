package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append(234);
        stringBuilder.append(3.1233);
        System.out.println(stringBuilder);
    }
}
