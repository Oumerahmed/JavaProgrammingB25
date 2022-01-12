package day21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        String[] name = {"oumer", "ahmrd", "adem"};


        for (String each : name) {
            System.out.println(each);
        }


        for (int i = 0; i < numbers.length; i++) {

            int eachElement = numbers[i];
            System.out.println(eachElement);

        }

        System.out.println("-----------------------");


        for (int each : numbers) {          // each element of array
            System.out.println(each);


        }
    }
}
