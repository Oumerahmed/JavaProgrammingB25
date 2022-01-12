package day12_Scanner;

import java.util.Scanner;

public class MyAddressInfo {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstname = input.nextLine();

        System.out.println("Enter your last name");
        String lastname= input.nextLine();

        System.out.println("Enter your building number");
        String buildingnumber =input.nextLine();

        System.out.println("Enter street address");
        String streetaddress = input.nextLine();

        System.out.println("Enter city name");
        String cuontryname= input.next();

        System.out.println("zip code");
        String zipcode = input.next();

        System.out.println("Enter state name");
        String statename = input.nextLine();

        System.out.println("Enter country name");
        String contryrname = input.nextLine();


    }
}
       // use my address