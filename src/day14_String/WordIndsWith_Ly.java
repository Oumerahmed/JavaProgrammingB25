package day14_String;

import java.util.Scanner;

public class WordIndsWith_Ly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        if (word.endsWith("ly")) {
            System.out.println("realy???");
        } else {
            System.out.println("never mind");

            System.out.println("word = " + word);

        }
    }
}
       /*2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
      otherwise, print "never mind"  */
