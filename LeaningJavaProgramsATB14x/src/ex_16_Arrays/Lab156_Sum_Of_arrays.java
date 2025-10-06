package ex_16_Arrays;

public class Lab156_Sum_Of_arrays {
    public static void main(String[] args) {
        int[] numbers={13,78,45};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}
