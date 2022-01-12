package day11_Switch_Scanner;

public class Gread {
    public static void main(String[] args) {

        char ch = 'x';
        switch (ch) {

            case 'A':
                System.out.println("excellent");
                break;

            case 'B':
                 System.out.println("great job");
                break;

            case 'C':
                  System.out.println("good");
                  break;
            case  'D':
                System.out.println("passed");

            case  'F':
                System.out.println("failed");

            default:
                System.out.println("invalid");


               // after Case we have to use : this sign.

        }

    }
}
