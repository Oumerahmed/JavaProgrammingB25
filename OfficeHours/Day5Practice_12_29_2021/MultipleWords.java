package Day5Practice_12_29_2021;

import java.util.Arrays;

public class MultipleWords {



    /*

    Task :  Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dishwasher”

        output : wooden spoons
                 trash can
                  dishwasher
         */


    public static void main(String[] args) {

        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dishwasher";

        String[] splitArr = words.split(",");
        System.out.println(Arrays.toString(splitArr));

        for (String eachWord : splitArr) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }
        }


    }

}
