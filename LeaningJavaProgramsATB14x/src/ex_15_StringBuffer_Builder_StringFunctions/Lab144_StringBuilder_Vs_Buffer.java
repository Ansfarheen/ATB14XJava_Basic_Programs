package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String --90%
        String s0= "Farheen";
        String s1 = new String("Farheen");


        // less than 10% used
        StringBuilder stringBuilder= new StringBuilder("Farheen");
        StringBuffer stringBuffer=new StringBuffer("Farheen");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
