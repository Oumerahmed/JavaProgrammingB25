package day29_ArrayList;

import utility.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacter {
    public static void main(String[] args) {


        String str = "aaabccccdeeef";

        String[] arr = str.split("");


        str.split("");


        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);


        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency == 1) {

                unique += each;

            }

        }

        System.out.println("unique = " + unique);


    }
}
