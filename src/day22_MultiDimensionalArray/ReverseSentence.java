package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = " Today is a good day to learn a java";

        String [] word = sentence.split(" ");

        System.out.println(Arrays.toString(word));

        String reverseSentence = "";  // java learn today to good ..

        for (int i = word.length-1; i >=0 ;i--){
            reverseSentence += word[i]+" ";
        }

        System.out.println(reverseSentence);




    }
}
      /*1. Write a program that can reverse a sentence
        Ex:
        sentence = "Today is a good day to learn Java";
        output:
        Java learn to day good a is Today
      */