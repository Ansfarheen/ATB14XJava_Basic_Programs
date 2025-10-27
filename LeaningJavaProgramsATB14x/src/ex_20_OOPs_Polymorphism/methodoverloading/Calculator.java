package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1= new Calc();
        c1.add(3.5,4.2);
    }
}

class Calc{
    int add(int a , int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}
