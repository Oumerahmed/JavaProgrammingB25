package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        // store the elements : 10 20 50 70

        int[] number = {10, 20, 50, 70}; // size 4

        System.out.println(Arrays.toString(number));

        System.out.println("-------------------");

        //crate a variable that can contain 5 scores

        int[] scores = new int[5]; // [ 0 0 0 0 0]

            scores[1] = 85;
            scores[scores.length-1]= 95;
            scores[3]=75;
            scores[0]=65;
            scores[2]=55;

        System.out.println(Arrays.toString(scores)); // [65 85 55 75 95]

        System.out.println("---------------------");

        String[] month = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        // index :          0      1     2       3      4      5      6      7       8      9     10       11
        /* System.out.println(month[0]);  jan
        System.out.println(month[1]);   // feb
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);

       */

       for (int i =0; i<month.length; i++){  // i: represents the index number of array starting from 0
           System.out.println(month[i]);
       }

        System.out.println("-----------------");

       for (int i = month.length-1; i >=0; i--){
           System.out.println(month[i]);
       }















        int num = 7;

        if (num < 1 || num > 12) {
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(month[8]);   // sep
    }
}