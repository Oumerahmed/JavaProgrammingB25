package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner imput =new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullname = imput.nextLine();

        System.out.println("Enter your building number");
        String building = imput.next(); //7925A

        imput.nextLine(); // Enter

        System.out.println("Enter your street address");
        String street = imput.nextLine();  // jone branch drive

        System.out.println("Enter your city name");
        String city = imput.nextLine();  //des moines

        System.out.println("Enter your state name");
        String state = imput.next(); //VA

        System.out.println("Enter zip code");
        String zipcode= imput.next();  //98198

        imput.nextLine();

        System.out.println("Enter your country name");
        String contry = imput.nextLine();







    }
}

/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */
