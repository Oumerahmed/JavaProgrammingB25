package Day2Practice_12_08_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /* Create a program that will give you the Fibonacci numbers up to the x value.

         Fibonacci is a sequence of number starting from 0, 1 where the following numbers are
         the sum of the previous 2 numbers

          Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0,
          1st value is 1, 2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13,

        */


        Scanner input = new Scanner(System.in);
        System.out.println("how many fibonacci number do you want to see");
        int number = input.nextInt();
        int num1 =0;
        int num2= 1;
        int result = 0;

   //     System.out.println(num1);
    //    System.out.println(num2);

     //   for (int i = 2;i<number;i++){  //
      //      result=num1+num2;  // 0+1=1
      //      System.out.println(result);

      //      num1=num2;  // num1 =1
       //     num2=result;  // num2 =1

     //   }


    int [] fibo= new int[number];

    fibo[0]= 0;
    fibo[1]=1;

    for (int i= 2; i<number;i++){
        fibo[i]= fibo[i-1]+fibo[i-2];

        // fibo[2]= fibo[1] + fibo[0]

    }
        System.out.println(Arrays.toString(fibo));

           // interview question
    /*
           Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
           In other words, zero or more characters at the very begining of the given string, and at the very end of the
           string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

                  mirrorEnds("abXYZba") → "ab"
                  mirrorEnds("abca") → "a"
                  mirrorEnds("aba") → "aba"
         */



    }
}
