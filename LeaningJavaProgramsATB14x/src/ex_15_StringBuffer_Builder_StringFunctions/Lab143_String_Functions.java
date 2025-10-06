package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name="Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10));
        System.out.println(name.concat("Patel"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("Sonal"));
        System.out.println(name.equalsIgnoreCase("sonal"));
        System.out.println(name.indexOf('o'));

        String s2="madam";
        System.out.println(s2.indexOf('a'));

        //-------------------------------------------------


        StringBuilder sb= new StringBuilder("Sonal");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        StringBuilder sb1= new StringBuilder("HIIII");
        System.out.println(sb1.toString());


    }
}
