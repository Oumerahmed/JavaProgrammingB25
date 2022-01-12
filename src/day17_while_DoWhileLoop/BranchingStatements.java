package day17_while_DoWhileLoop;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (char i = 'A';i <='Z';i++){

            System.out.println(i+" ");  // A B C D E F

            if (i=='F'){

             break;  // Exits the loop
            }
        }
        System.out.println();

        System.out.println("------------------------------");

       while (true){
         System.out.println("Enter a number");

         int num =scan.nextInt();
         if (num<0){
             break;
         }
     }

        System.out.println("-------------------");



    }
}
        /*
            if(true){
                break;
            }
         */