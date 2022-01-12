package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("How many number would you like to Enter");
        int length = scan.nextInt();


        if (length <= 0){
            System.out.println("Invalid Entry");
            System.exit(0);

        }

        int [] number = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number ");
            number[i]= scan.nextInt();
        }

        System.out.println(Arrays.toString(number));


        System.out.println("====================");

        String [] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

        System.out.println(Arrays.toString(months));

































    }
}