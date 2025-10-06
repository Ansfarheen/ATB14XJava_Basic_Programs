package Practice_Java;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1,100, 3,94,32,199};
        int max=numbers[0];
        int secondMax= numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max){
                secondMax= max;
                max=numbers[i];
            } else if (numbers[i]>secondMax && numbers[i]!=max) {
                secondMax=numbers[i];
            }
        }
        System.out.println("The second maximum element is " +secondMax);

    }
}
