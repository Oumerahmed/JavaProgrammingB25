package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        System.out.println("Enter full name");

        String fullname= input.nextLine();

        System.out.println("Enter your program language");

        System.out.println("fullname = " + fullname);
        input.close();
    }
}
