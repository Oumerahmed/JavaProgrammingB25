package day14_String;

import java.util.Scanner;

public class EnterTwoWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter tow words with out first character");

    String word1 = input.nextLine();
   String word2 =input.nextLine();

     String str = word1.substring(1)+word2.substring(1);
        System.out.println(str);
    }
}
    /*
   1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */
