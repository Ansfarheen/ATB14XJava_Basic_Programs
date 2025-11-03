package ex_27_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab206_Checked {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file= new FileInputStream("D://log.txt");
    }
}
