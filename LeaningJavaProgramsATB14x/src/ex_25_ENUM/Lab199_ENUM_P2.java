package ex_25_ENUM;

public class Lab199_ENUM_P2 {
    public static void main(String[] args) {
        System.out.println(HEX_COLORS.RED.getHexCode());
    }
}


enum HEX_COLORS{
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00");

    private String hexCode;

    HEX_COLORS(String hexCode){
        this.hexCode=hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }
}
