package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
        Car2 car2= new Car2();
        car2.drive();
    }
}

class Car2 implements Brakes,Engine1{

    void drive(){
        startEngine();
        applyBrakes();
        stopEngine();
    }

    @Override
    public void applyBrakes() {
        System.out.println("Apply brakes");
    }

    @Override
    public void startEngine() {
        System.out.println("start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop engine");
    }
}

interface Brakes{
    void applyBrakes();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("Concrete complete");
    }

    default void testEngine1(){
        System.out.println("Concrete complete class");
    }
}
