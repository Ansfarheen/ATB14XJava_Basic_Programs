package ex_19_OOPs_Part2.OOPs_01_inheritance.singleinheritance.singleInheritance.realExample;

public class Lab168_SI {
    public static void main(String[] args) {
        Son pramod= new Son();
        System.out.println(pramod.gold_f);
        pramod.bhk3();;
        pramod.bhk2();

        Father f1= new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
    }
}
