package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "xcodeX";
        String result =str.replace("x","a").replace("X","a");
         // "acodex "                                       "acode"
        System.out.println(result);

    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */