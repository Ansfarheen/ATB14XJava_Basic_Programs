package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car tesla= new Car(300);
        tesla.drive();
    }
}

class Vehicle{
    public int maxSpeed=180;
    void noTest(){
        System.out.println("Empty!!");
    }
    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Param Constructor");
    }

    Vehicle(int a,int b){
        System.out.println("Param Cons");
    }

    void message(){
        System.out.println("No return, no argument");
    }

    void message(int a){
        System.out.println("PC-argument");
    }

    void drive(){
        System.out.println("Vehicle Parent");
    }
}


class Car extends Vehicle{
    private int maxSpeed=281;

    Car(){
        super(100);
    }

    Car(int speed){
        this.maxSpeed=speed;
    }

    void test(){

    }

    void drive(){
        System.out.println("Over ridden the vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}
