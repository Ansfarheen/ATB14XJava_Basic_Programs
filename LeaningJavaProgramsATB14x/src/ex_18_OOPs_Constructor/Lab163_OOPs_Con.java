package ex_18_OOPs_Constructor;

public class Lab163_OOPs_Con {
    public static void main(String[] args) {
        A a1= new A();
        System.out.println(a1);
    }
}

class A{
    A(){
        System.out.println("I want to read CSV file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything");
    }
}
