package ex_22_OOPs_accessModifier.criminal;

import ex_22_OOPs_accessModifier.police.Cop;

public class Rahul extends Cop {

    public Rahul(int bullet){
        super(bullet);
    }
    public static void main(String[] args) {
        Cop p= new Cop(100);

    }
}
