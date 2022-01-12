package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner imput =   new Scanner(System.in);

        System.out.println("Enter the curent speed limit");
        int speedlimit = imput.nextInt();
        String result1 = "";

       if (speedlimit>= 55){
           result1 = "you're driving  " +(speedlimit)+ "mph over the limit slow down!";
       }
        System.out.println(result1);


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