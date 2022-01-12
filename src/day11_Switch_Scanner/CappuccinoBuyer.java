package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size= "tall";
        String result1 = "";

        if (size== "tall" || size== "grande" || size== "venti"){

           if (size=="tall"){

               result1 =("tall: " +"price is $ 3.69 "+"\n 90 calories");
           }else if(size=="grande"){

               result1 =("grande: " + "price is $ 3.99"+"\n 120 caories");
           }else {
               result1 = ("veti:  " + " price is 4.29 "+"\n 150 calories");
           }

        }else {
            result1 = " invalid size";
        }

        System.out.println(result1);

        System.out.println("----------------");

        //     by switch

        String size2 ="tall";
        String result2 = "";

        if (size== "tall" || size== "grande" || size== "venti"){


        }else {
            result2 = ("invalid size");
        }

    }
}
/*1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

        Valid sizes are tall, grande, venti and thier price & calories are:

        tall:
        price is $3.69
        90 calories

        grande:
        price is $3.99;
        120 calories

        venti:
        price is $4.29
        150 calories

        If the size is invalid then the output shoud be "Invalid Size"

        Note:
        Solution 1: use if statement
        Solution 2: use switch statement
        Solution 2: use if & switch statements mixed

 */