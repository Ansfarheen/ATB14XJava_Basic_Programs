package ex_23_OOPs_Super_Abstraction;

public class Lab191_Interface_variables {
}


interface Pramod{
    int a=10;
    void display();
}

class Dutta implements Pramod{

    int a=10;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.a);
    }
}
