package day3_12_18_2021;

import java.util.Scanner;

public class LoopIntro {
    public static void main(String[] args) {
/*
                 Classic for-loop counting up from 0 to 99
                 0, 1, 2, 3, ... 99
                -init int i = 0
                -test i<100
                -increment i++
                */

        for(int i =0; i<100; i++){

            System.out.print(i+"");
        }

        System.out.println("---------------------------");


        // even no from0 to 100

        System.out.println(0);
        for (int i = 1;i< 100;i+=2){

            System.out.print(" "+i);

        }


        //  even no from0 to 100

        for (int i = 1;i< 100;i+=2){

            System.out.print(i+" ");

        }

        System.out.println("__________________");


        for (int i = 0; i < 100; i+=5) {
            System.out.println(i++);

        }

      // even no 100 to 0
        System.out.println("----------------");

        for (int i = 100; i >=0; i +=-2){
            System.out.println(i+"");
        }



        System.out.println("----------------");


        String firstName = "omar";
        String lastName = "adam";


       firstName = ("  "+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();

       lastName = (" "+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        System.out.println("================");


        Scanner scan = new Scanner(System.in);

        int min = 2147483647;


        for (int i = 10; i <15 ; i++) {

            System.out.println("Enter  a number");
            int number = scan.nextInt();



            if(number<min){
                min= number;
            }

        }


        System.out.println("min = " + min);

        scan.close();


        System.out.println("========================");

      // replace x with a


        String str = "xcodex";

        str.replace("x","a");



        System.out.println("str = " + str);



    }
}
