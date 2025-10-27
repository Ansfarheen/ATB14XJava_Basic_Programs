package ex_24_Static;

public class Lab192_Static {
    public static void main(String[] args) {
        Student s1= new Student(22);
        Student s2= new Student(25);
        System.out.println(Student.course_name);

        System.out.println(s1.course_name);
    }
}

class Student{
    int age;
    static String course_name="ATB";

    public Student(int age_c){
        this.age=age_c;
    }

    static void m1(){
        System.out.println("I am static method");
    }
}
