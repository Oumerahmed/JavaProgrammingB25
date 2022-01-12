package day20_Arrays;

import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        // find the average number
        int[] numbers = {1, 2, 3, 4, 5, 6,};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }
        double averageNumber = sum / numbers.length;

        System.out.println(Arrays.toString(numbers));

        System.out.println("sum = " + sum);

        System.out.println("averageNumber = " + averageNumber);

    }
}
