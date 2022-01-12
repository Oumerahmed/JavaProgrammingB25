package day12_Scanner;

import java.util.Scanner;

public class KillometerToMileConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Killometer");
        double kilometre = input.nextDouble();
        String result = "";

        double mile =  kilometre/1.6;

        result = kilometre + " kilometre is equal to " + mile + " miles";
        System.out.println(result);
    }
}
