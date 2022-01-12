package day20_Arrays;

import java.util.Arrays;

public class MinNumberArray {
    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 40, 600, 80, -90};
        int min = numbers[0]; // 30

        for (int i = 0; i < numbers.length; i++) { // i: 0 1 2 3...

            if (numbers[i] < min) {// if there is an element array that smaller
                min = numbers[i];  // smaller number assigned.
            }
        }
             System.out.println(min);

    }
}
