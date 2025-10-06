package ex_14_Strings;

public class LabStringExamples1 {
    public static void main(String[] args) {
        String s= "Java";
        char c= s.charAt(2);
        System.out.println(c);

        int result= "abc".compareTo("abc");
        System.out.println(result);

        int idx= "Java".indexOf("a");
        System.out.println(idx);

        int lidx= "Java".lastIndexOf("a");
        System.out.println(lidx);

        String s1= String.join("$","Python","Java");
        System.out.println(s1);

        String s12= "Java".replace('a','A');
        System.out.println(s12);
    }
}
