package ex_25_ENUM;

public class Lab200_ENUM_REAL_WEB_AUTOMATION {
    public static void main(String[] args) {
        System.out.println(Locators.page_input.getLocator());
    }
}

enum Locators {
    page_button("#btn"),
    page_input("#input1");

    private String locator;

    Locators(String locator) {
        this.locator = locator;
    }

    String getLocator() {
        return this.locator;
    }
}
