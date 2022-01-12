package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
                   //   0   1   2   3
        int[] number = {10, 20, 30,40};

        int [] reversed = new int[number.length];// to make sure array has enough capacity to contain all element 1st array
         /*           j          i
             reversed[0]= number[3];
             reversed[1]= number[2];
             reversed[2]= number[1];
             reversed[3]= number[0];
            */
        int j = 0;
        for (int i = number.length-1; i >=0;i--,  j++){
            reversed[j] = number[i];
        }
           System.out.println(Arrays.toString(reversed));
    }
}
