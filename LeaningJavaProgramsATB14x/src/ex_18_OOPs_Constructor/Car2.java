package ex_18_OOPs_Constructor;

public class Car2 {
    String model;
    int year;

    Car2(){
        model= "XXXX";
        year=0;
        System.out.println("DC");

    }

    Car2(String model , int year){
        this(model);
        this.year=year;
    }

    Car2(String name){
        this.model=name;
    }
}
