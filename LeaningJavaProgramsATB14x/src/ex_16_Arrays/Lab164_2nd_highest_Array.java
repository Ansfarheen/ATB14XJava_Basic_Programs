package ex_16_Arrays;

public class Lab164_2nd_highest_Array {
    public static void main(String[] args) {
        int[] numbers= {12,45,67,89,45,890};
        int highest=0;
        int secondHighest=0;

        for(int num: numbers){
            if(num>highest){
                secondHighest=highest;
                highest=num;
            }
            else if(num>secondHighest && num !=highest){
                secondHighest=num;
            }
        }
        System.out.println("The secong highest is "+secondHighest);
    }
}
