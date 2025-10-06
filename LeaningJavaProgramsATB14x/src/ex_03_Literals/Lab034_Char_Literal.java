package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1= 'A';
        char c2= 'B';
        char c3= '@';
        char c4= '_';
        char c5= '9';
        char c6= '1';
        char c7= '(';
        char c8= ' ';

        char new_line= '\n';
        char tab_line= '\t';
        char back_space= '\b';
        char carriage_return ='\r';

        System.out.println("Farheen"+new_line+"Ansari");
        System.out.println("Farheen"+tab_line+"Ansari");
        System.out.println("Farheen"+back_space+"Ansari");
        System.out.println("Farheen"+carriage_return+"Ansari");

        char unicode='\u1F60';
        System.out.println(unicode);



    }
}
