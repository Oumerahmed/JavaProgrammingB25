package day17_while_DoWhileLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name ");
        String u = scan.next();
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){ // if credentials are valid
            System.out.println("logged in");

        }else {  //if credential are not valid
            int attempt =3; // 3 2 1

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt>0){//invalid and user has attempts to reenter


                System.out.println("incorrect user name or password ,please re enter");
                System.out.println("Enter your user name");
                u = scan.next();

                System.out.println("Enter your password");
                p= scan.next();
                attempt-- ;

                if (u.equals("Cydeo") && p.equals("Cydeo123")){
                    System.out.println("logged in");
                    attempt--;
                }else {
                    System.out.println("your account is locked");
                }

            }



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
