package ex_24_Static;

public class Lab195_Real_Java {
}

class ATB14x{

    {
        System.out.println("IIB- this is called when object is created");
    }

    static {
        System.out.println("This is called when class is loaded");
    }

    private String name; // non static
    private String phone;

    static String courseName = "ATB14x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

}
