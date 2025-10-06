package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a=10;
        int marks[]= {23,12,67,56,45,38,89};

        boolean[] is_married={false,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);

        //System.out.println(marks[-1]);

        String name="pramod";
        String[] name_split= name.split("");
        for (String s:name_split) {
            System.out.println(s);
        }
    }
}
