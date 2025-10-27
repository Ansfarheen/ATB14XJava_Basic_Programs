package ex_22_OOPs_accessModifier.police;

public class Cop {

    public int gun;
    private String iCard;

    public Cop(int bullet){
        this.gun=bullet;
    }

    public void canIShoot(){
        System.out.println("Yes you can...");
    }

     void thisDefault(){
        System.out.println("Hi!! Cop");
    }

}
