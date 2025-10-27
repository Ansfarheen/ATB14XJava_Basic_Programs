package ex_21_OOPs_Encapsulation;

public class Lab189_Escap_Demo {
    public static void main(String[] args) {
        VMOLogin vmoLogin= new VMOLogin("admin","password");
        System.out.println(vmoLogin.password);

        GoodVMOLogin goodVMOLogin= new GoodVMOLogin("admin","password");
        String pass = goodVMOLogin.getPassword();
        System.out.println(pass);
        goodVMOLogin.setPassword("admin244",true);

    }
}

class VMOLogin{
    public String username;
    public String password;

    public VMOLogin(String username , String password){
        this.username=username;
        this.password=password;

    }
}

class GoodVMOLogin{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isGoodAdmin) {
        if(isGoodAdmin) this.password = password;
        else System.out.println("Not allowed");
    }

    public GoodVMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


}