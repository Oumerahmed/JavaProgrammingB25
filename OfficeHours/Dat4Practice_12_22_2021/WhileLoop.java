package Dat4Practice_12_22_2021;

public class WhileLoop {
    public static void main(String[] args) {


        //  int number = 5;

        //  while (number < 100) {


        //        number += number;  // number = number +number = 10+10 ..


        //     }


        //       System.out.println(number);


        int a = 0;

        do {
            a = a++ + --a - (a % 3);  //  a=1+1

        } while (++a < 4);

        System.out.println(a);


    }
}
