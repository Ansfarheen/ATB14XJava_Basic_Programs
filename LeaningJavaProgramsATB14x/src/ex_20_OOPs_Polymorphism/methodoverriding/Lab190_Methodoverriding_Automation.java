package ex_20_OOPs_Polymorphism.methodoverriding;

public class Lab190_Methodoverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1= new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1= new FirefoxTC();
        f1.openBrowser();

        CommonToAll commonToAll= new CommonToAll();
        commonToAll.openBrowser();

        CommonToAll c5= new ChromeTC();
        c5.openBrowser();

        CommonToAll c3= new FirefoxTC();
        c3.openBrowser();
    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting the IE Browser...");
    }
}

class ChromeTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Stating chrome, better browser");
    }
}

class FirefoxTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Stating firefox, better browser");
    }
}


