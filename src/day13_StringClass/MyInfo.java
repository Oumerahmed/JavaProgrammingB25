package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();  // 19

        System.out.println("Enter your gender");

        String gender = scan.next();  // male

        scan.nextLine();  // Enter

        System.out.println("Enter your full name");
        String fullname = scan.nextLine();   // if the previous scanner that used is not nextline(),we need 1 nextline method

        System.out.println("Enter your phone number");
        long phonenumber = scan.nextInt();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        scan.nextLine();    //before we give nextline wa should check previous line

        System.out.println("Enter your school name");
        String schoolname = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.next();

        System.out.println("Enter your state name");
        String state = scan.next();

        System.out.println("Enter your biulding name");
        int biuldingnum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        scan.close();

        System.out.println("fullname = " + fullname);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phonenumber = " + phonenumber);
        System.out.println("addresse: \n \t" + biuldingnum + "  " + street + " \n\t " + city + "," + state + " " + zipcode);
        System.out.println("  schoolname:  " + schoolname);

    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age ( int --> nextInt() )
			2. Enter your gender (String- One word ONLY --> next())  nextLine()
			3. Enter your full name (String- Multiple words --> nextLine())
			4. Enter your phone number (long --> nextLong())
			5. Enter your zip code (int --> nextInt())   nextLine()
			6. Enter your School name (String- Can be Multiple words --> nextLine())
			7. Enter your city name (String- Can be Multiple words--> nextLine() )
			8. Enter your state name (String- One word ONLY --> next())
			9. Enter your building number (int --> nextInt())  nextLine()
			10. Enter your Street name ( nextLine() )
		MAKE SURE USER CAN ENTER ALL THE INPUT
		Display all the inputs that user entered in following order in sperate lines:
			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode
			6. school name
 */