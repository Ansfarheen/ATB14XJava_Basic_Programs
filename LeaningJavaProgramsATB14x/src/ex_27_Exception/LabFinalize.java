package ex_27_Exception;

public class LabFinalize {
    public static void main(String[] args) {
        LabFinalize lf= new LabFinalize();
        lf=null;
        System.gc();
        System.out.println("Main method done");
    }

    public void finalize(){
        System.out.println("Hiii, I finalize has been called");
    }
}
