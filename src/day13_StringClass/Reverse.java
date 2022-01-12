package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five character word");
        String word = input.next();
        String result = "";
        if (word.length() == 5) {
            System.out.println(word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0));

        } else if (word.length() > 5) {
            System.out.println("Too long");
        } else {
            System.out.println("Too short");
        }
        System.out.println(result);
    }
}
     /*1.  Create a class called Reverse, write a program that will reverse a string.
      Your program should reverse a string only 5 characters long. If word is shorter,
    display message: "Too short!". If word is longer, display message: "Too long!*/