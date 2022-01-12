package day14_String;

import java.util.Scanner;

public class WordStartWith_x {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter word");

        String word = input.next();

        char first = word.charAt(0);

        if (first == 'x') {
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }

        System.out.println("word = " + word);
    }
}

 /*3. Ask user to enter a word. If the work starts with x, print the word without x.
         Input:
         xcode
         Output:
         code

  */