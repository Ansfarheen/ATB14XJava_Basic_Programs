package ex_30_Collection_Framework.CF_05_Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabComparator {
    public static void main(String[] args) {
        Employee2 e1= new Employee2(3,"Amit");
        Employee2 e2= new Employee2(1,"Pramod");
        Employee2 e3= new Employee2(5,"Dutta");
        List<Employee2> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Comparator<Employee2> nameComparator= (e11,e21) -> e11.name.compareTo(e21.name);
        Comparator<Employee2> idComparator= (e11,e22) ->e11.id-e22.id;
        Collections.sort(list,nameComparator);
        System.out.println(list);


    }

}

class Employee2{
    int id;
    String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return id+" - "+name;
    }

}

