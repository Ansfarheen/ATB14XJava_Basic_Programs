package ex_17_OOPs;

public class Lab160_Constructor {
    public static void main(String[] args) {
        Student student= new Student();
        Student s2= new Student("Pramod");
    }
}

class Student{
    String name;

    Student(){
        System.out.println("Hiii, I am called");
    }

    Student(String name){
        System.out.println("Hii , I am "+name);
    }

    void sleep(){}
    void study(){}
    void eat(){}
}
