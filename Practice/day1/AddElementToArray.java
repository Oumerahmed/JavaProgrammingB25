package day1;

import utility.ArraysUtility;

import java.sql.Array;
import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {


        String[] name = {"ouner", "adem", "ahmed",};
        name = addString(name, "haji");

        System.out.println(Arrays.toString(name));

    }


    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;for (String each : array) {
           result[i++] = each;


       }
        result[result.length - 1] = element;
        return result;
    }




         int [] number = {3, 6, 9};




}