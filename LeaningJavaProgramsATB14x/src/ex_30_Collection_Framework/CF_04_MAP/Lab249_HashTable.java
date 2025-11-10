package ex_30_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab249_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(4, null); java.lang.NullPointerException
//        ht1.put(null, "three"); // java.lang.NullPointerException
        System.out.println(ht1);

        HashMap<Integer,String> ht2 = new HashMap<>();
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null);
        ht2.put(null, null);
        System.out.println(ht2);
    }
}
