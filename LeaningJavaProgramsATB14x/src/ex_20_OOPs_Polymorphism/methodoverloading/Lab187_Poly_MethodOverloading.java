package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1= new MathOperations();
        int r1= m1.add(3,5);
        int r2= m1.add(3,1,7);
        double r3= m1.add(2.12,7.98);
    }
}

class MathOperations{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }
}
