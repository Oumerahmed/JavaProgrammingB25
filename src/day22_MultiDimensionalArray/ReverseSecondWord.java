package day22_MultiDimensionalArray;

import java.util.Arrays;

    public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "i love java";

        String []word =sentence.split(""); //[ i love java]

        String reverse = "";

       for (int i = word[1].length()-1;i >=0; i--){
           reverse+= word[1].charAt(i);
       }

        System.out.println(reverse);

       word[1] =reverse;
        System.out.println(Arrays.toString(word));

        String result = " ";

        for (String words:word){
            result+= words+=" ";
        }

        System.out.println(result);

    }
}

      /*
         2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";
			output:
				I evoL Java
             */






