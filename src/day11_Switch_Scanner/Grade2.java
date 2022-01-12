package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'F';  // if A||B||C||D or logic we can do like this
        String result = "";
        switch (ch) {

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid");
        }

        System.out.println(result);
    }
}
       /*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"

        */
