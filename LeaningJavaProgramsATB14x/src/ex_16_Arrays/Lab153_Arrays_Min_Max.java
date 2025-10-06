package ex_16_Arrays;

public class Lab153_Arrays_Min_Max {
    public static void main(String[] args) {
        int[] array = {12,56,34,23,89,45,99,89,44};

//        int max=array[0];
//        for (int i = 1; i < array.length; i++) {
//            if(array[i]>max){
//                max=array[i];
//            }
//        }
//        System.out.println(max);

        int min= array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i]){
                min= array[i];
            }
        }
        System.out.println(min);
    }
}
