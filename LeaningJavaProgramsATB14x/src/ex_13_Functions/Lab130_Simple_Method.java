package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_return_type_function();
        String name=return_string_type_function();
        System.out.println(name);
    }

    static void non_return_type_function(){
        System.out.println("Hi there, no return function ");
    }

    static String return_string_type_function(){
        System.out.println("Hi there, I will return something ");
        return "Farheen";
    }

    static float return_float(){
        return 3.14f;
    }
    static boolean return_boolean(){
        return true;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }
}
