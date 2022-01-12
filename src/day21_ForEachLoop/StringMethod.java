package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String str = " Java";

        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.println(each);
        }

        System.out.println("----------");

        String sentence = " wooden spoon";


        String[] word = sentence.split("");

        System.out.println(Arrays.toString(word));

        System.out.println("_____________");

        String email = "woodenspoon@yahoo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------");

        String s = " to day is nice day  today is monday ";

        String[] sentences = s.split("\\.");

        System.out.println(Arrays.toString(sentences));
    }
}
