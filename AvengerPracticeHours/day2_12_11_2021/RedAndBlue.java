package day2_12_11_2021;

public class RedAndBlue {
    public static void main(String[] args) {

     /* 2  Given a string, if the string begins with "red" or "blue" print that color string,
        otherwise print the empty string.

                input :"redxx" → "red"
        input :"xxred" → ""
        input :"blueTimes" → "blue"

      */

        String word = "redxx";
        String temp = "";

        if (word.startsWith("red")) {
            temp = "\"red\"";
        } else if (word.startsWith("blue")) {
            temp = "\"blue\"";

        } else {
            temp = "\"\"";
        }

        System.out.println("temp = " + temp);


    }
}
