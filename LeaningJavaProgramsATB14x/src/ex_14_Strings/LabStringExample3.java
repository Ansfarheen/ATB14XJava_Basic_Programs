package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s= "Java".substring(2);
        System.out.println(s);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        String st=" Java ".trim();
        System.out.println(st);

        boolean b= "".isBlank();
        System.out.println(b);

        boolean res= " ".isEmpty();
        System.out.println(res);

        long count="a\nb\nc".lines().count();
        System.out.println(count);
    }
}
