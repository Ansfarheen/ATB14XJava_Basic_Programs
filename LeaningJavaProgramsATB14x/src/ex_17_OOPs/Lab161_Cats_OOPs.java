package ex_17_OOPs;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c23= new Cat();
        Cat c24= new Cat("Lucy");
        Cat c25= new  Cat("Spice");
        new Cat();
        System.out.println(c24.name);
        System.out.println(c25.name);
        c24.running();
        c25.running();
    }



}
class Cat{
    String name;
    Cat(){
        name="Kitty";
    }

    Cat(String name){
        this.name= name;
    }
    void running(){
        System.out.printf("%s is running ",this.name);
    }
}

