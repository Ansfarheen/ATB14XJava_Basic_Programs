package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_number {
    public static void main(String[] args) {
        int[] numbers= {12,45,18,89,79,55,67};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
