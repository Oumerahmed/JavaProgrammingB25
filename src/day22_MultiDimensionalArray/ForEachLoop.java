package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        // index of element  0 1 2       0 2 3 4           0  1  2  3 4
           int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7,}, {8, 9, 10, 11, 12}};

        //                       0           1              2

        for (int[] each1dArray : arr2D) {

            for (int eachElement : each1dArray) {
                System.out.print(eachElement);
            }
        }


    }
}
