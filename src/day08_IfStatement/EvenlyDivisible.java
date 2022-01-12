package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 100;
        boolean divisibleBy2 = number % 2 == 0;  // if the reminder divided by 2 is zero, the evenly divided by 2.
        boolean divisibleby3 = number % 3 == 0;
        boolean divisible5 = number % 5 == 0;

        System.out.println(number + " divisible by 2: = " + divisibleBy2);
        System.out.println(number + " divisible by 3 =  " + divisibleby3);
        System.out.println( number +" divisible by 5 =  " + divisible5);

        System.out.println("__________________________________________");

        int year = 2000;

        boolean isLeaoYear = year % 4 ==0;

        System.out.println( year + "isLeao Year: = " + isLeaoYear);
    }
}
/*2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
        Ex:
        number = 65;

        output:
        65 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true
 */