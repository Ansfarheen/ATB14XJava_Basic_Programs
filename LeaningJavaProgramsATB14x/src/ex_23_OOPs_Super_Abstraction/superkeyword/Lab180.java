package ex_23_OOPs_Super_Abstraction.superkeyword;

public class Lab180 {

}

class BaseClass{
    private String browser;

    BaseClass(){
        System.out.println("Default constructor of BaseClass");
    }

    BaseClass(String browser){
        this.browser=browser;
        System.out.println("DC->Parent");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser -> "+browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}

class TestCase extends BaseClass{

    void testC(){}

    TestCase(){
        super("Chrome");
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("Firefox");
    }
}
