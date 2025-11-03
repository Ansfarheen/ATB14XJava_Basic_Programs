package ex_27_Exception;

public class Lab204_Exception {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip= args[0];
        int a= Integer.parseInt(ip);
        int b=100/a;
        System.out.println(b);
    }
}
