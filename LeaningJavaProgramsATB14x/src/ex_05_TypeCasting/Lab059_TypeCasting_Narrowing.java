package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val =300;
        // byte b= val;   // narrowing
        byte b =(byte) val;
    }
}
