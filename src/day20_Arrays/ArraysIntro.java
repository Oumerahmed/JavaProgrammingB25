package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create variable that capable enough to contain  5 name
        String[] myGroup = new String[5];  //0 ~ 4

        myGroup[0] = "Gunay";
        myGroup[1] = "nira";
        myGroup[2] = "suat";
        myGroup[3] = "omar";
        myGroup[4] = "adem";

        // System.out.println(myGroup); // hashcode will happen

        System.out.println(Arrays.toString(myGroup));  // [Gunay, nira ,Suat,omar, adem

        System.out.println("--------------------");

        String[] days = {"monday ", "tuesday", "wednesday", "thursday ", "friday", "saturday", "sunday"};
        // index :            0         1           2           3           4            5          6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 || number > 7) {
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[5]);  // saturday


        System.out.println("----------------------------");

        String[] month = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        // index :          0      1    2      3    4     5     6      7     8     9     10       11
        System.out.println(Arrays.toString(month));

        int num = 7;

        if (num < 1 || num > 12) {
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(month[8]);   // sep

    }
}
