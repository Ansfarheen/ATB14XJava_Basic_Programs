package ex_20_OOPs_Polymorphism.methodoverriding;

public class Lab189_Moverriding {

    public static void main(String[] args) {
        Pramod p1= new Pramod();
        p1.home();

        Father f1= new Father();
        f1.home();

        Father f2=new Pramod();
        f2.home();
    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Pramod extends Father{
    void home(){
        System.out.println("3BHK");
    }
}
