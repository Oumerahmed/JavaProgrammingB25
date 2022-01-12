package day12_Scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {


        Scanner imput = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = imput.nextInt();  //29

        imput.nextLine();  //Enter

        System.out.println("Enter your full name");
        String fullname= imput.nextLine();

        System.out.println("GPA");
        double gpa = imput.nextDouble();  //3.5

        imput.nextLine();  // Enter

        System.out.println("Enter your school name");
        String schoolname = imput.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);
        System.out.println("gpa =" +gpa );
        System.out.println("schoolname = " + schoolname);



    }
}

   /*
1. Ask the user to enter age (nextInt() )
2. Ask the user to enter full name (nextLine() )
 */