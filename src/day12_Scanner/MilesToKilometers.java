package day12_Scanner;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles");
        double mile = input.nextDouble();
        String result = "";

        double killometter = mile * 1.6;

        result = mile + " mile is equal to " + killometter + " kilometer";
        System.out.println(result);
    }
}
