package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab186_Better_Abstract_Class {

    public static void main(String[] args) {
        Alto a= new Alto();
        a.drive();
    }
}

abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}

class Alto extends Car1 implements Tyre,Gear,Engine{


    void drive(){
        rubberTyre();
        blackColorDoToTyre();
        this.startCar();
        startEngine();
        changeGear();
        this.stopCar();
    }
    @Override
    void startCar() {
        System.out.println("Starting the car");
    }

    @Override
    void stopCar() {
        System.out.println("Stopping the car");
    }

    @Override
    public void rubberTyre() {
        System.out.println("Rubber Tyre");
    }

    @Override
    public void blackColorDoToTyre() {
        System.out.println("Blacking of tyre");
    }

    @Override
    public void changeGear() {
        System.out.println("Changing the gear");
    }

        @Override
        public void startEngine() {
            System.out.println("Starting engine");
        }

}

interface Tyre{
    void rubberTyre();
    void blackColorDoToTyre();
}

interface Gear{
    void changeGear();
}

interface Engine{
    void startEngine();
}
