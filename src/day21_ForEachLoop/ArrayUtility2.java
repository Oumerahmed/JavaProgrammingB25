package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        String[] studdent = {"Elif", "Sinam", "Oumer", "Adem", "Cihad", "Aron", "Daniel"};
        String[] earlyBird = Arrays.copyOf(studdent, 2);
        System.out.println(Arrays.toString(earlyBird));

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        number = Arrays.copyOf(number, 4); //12345

        System.out.println(Arrays.toString(number));

        System.out.println("--------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6 + 1);

        System.out.println(Arrays.toString(ch2));


        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //            0   1   2   3   4   5   6   7   8    9

        int[] result = Arrays.copyOfRange(scores, 3, 8);

        System.out.println(Arrays.toString(result));


        int[] result2 = (Arrays.copyOfRange(scores, 5, scores.length));

        System.out.println(Arrays.toString(result2));

    }
}
