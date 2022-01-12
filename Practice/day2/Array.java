package day2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {




        String [] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

        System.out.println(Arrays.toString(months));


        for (int i = 0; i < months.length; i++) {
            System.out.print("   "+months[i]);
        }


        System.out.println("===============");

      // print common number


        int[]number1 ={10,20,30,40,50,60};
        int[]number2 ={200,20,60,70,80};

        String common = "";

        for ( int i :number1){
            for (int i1 :number2){
                if (i==i1){
                    System.out.println(i);
                }
            }
        }
        System.out.println("===============");


        int [] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

boolean r1 = Arrays.equals(arr1,arr2); // false


        System.out.println("r1 = " + r1);


    }
}
