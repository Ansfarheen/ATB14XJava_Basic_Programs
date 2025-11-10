package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab235_LL_List {
    public static void main(String[] args) {
        List mylist= new ArrayList();
        List mylist1= new ArrayList<>(10);
        List mylist2= List.of("12",23);


        List mylist4= new LinkedList();
        mylist4.add(1);
        mylist4.add(2);
        mylist4.add(3);
        mylist4.add("56");
        mylist4.add(1);
        mylist4.add(null);
        System.out.println(mylist4);
    }
}
