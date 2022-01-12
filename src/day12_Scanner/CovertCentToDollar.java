package day12_Scanner;

import java.util.Scanner;

public class CovertCentToDollar {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("Enter cents");

        int convert = imput.nextInt();

        int dollar = convert / 100;
        int cents = convert % 100;

        System.out.println(convert + " equal to dollar " + dollar + "  and  " + cents + " cents ");

    }
}
/*2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
        speedLimit = 55;
        Enter current speed:
        105

        output:
        You're driving 50 mph over the limit. Slow down!

 */