package day17_while_DoWhileLoop;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("will you marry me? yes/no");
        String a= scan.next().toLowerCase();

        while(!(a.equals("yes") || a.equals("no"))){
            System.out.println("invalid answer ,please re enter");
            a = scan.next().toLowerCase();
        }
        if (a.equals("yes")){
            System.out.println("Congrats");

        }else {
            System.out.println("Goodbye");
        }

    }
}
   /*
    2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
     */
