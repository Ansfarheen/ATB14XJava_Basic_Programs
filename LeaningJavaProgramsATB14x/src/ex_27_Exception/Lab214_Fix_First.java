package ex_27_Exception;

public class Lab214_Fix_First {
    public static void main(String[] args) {
        try {
            String ip= args[0];
            int a= Integer.parseInt(ip);
            int b= 100/a;
            System.out.println(b);
        }catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Problem");
        }
        finally {
            System.out.println("I will be always called");
        }
    }
}
