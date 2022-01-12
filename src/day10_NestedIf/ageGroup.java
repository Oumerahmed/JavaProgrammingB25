package day10_NestedIf;

public class ageGroup {
    public static void main(String[] args) {

        int number = 90;

        if (number <= 2 && number >= 0) {
            System.out.println("infant");
        } else if (number <= 5 && number >= 3) {
            System.out.println("Older");
        } else if (number <= 9 && number >= 6) {
            System.out.println("Kid");

        } else if (number <= 12 && number >= 10) {
            System.out.println("Pre-Teen");
        } else if (number <= 17 && number >= 13) {
            System.out.println("Teenager");

        } else if (number <= 18 && number >= 20) {
            System.out.println(" Young Adult");


        } else if (number <= 39 && number >= 21) {
            System.out.println("Adult");

        } else if (number <= 49 && number >= 40) {
            System.out.println("Young middle_ Adult age");

        } else if (number <= 54 && number >= 50) {
            System.out.println("Young middle Adult");


        } else if (number <= 64 && number >= 55) {

            System.out.println("Very young Senior Citizen");

        } else if (number <= 74 && number >= 65) {
            System.out.println("Young Senior Citizen");

        } else if (number <= 84 && number >= 75) {
            System.out.println("Senior Citizen ");

        } else {
            System.out.println("Old Senior");

        }
        System.out.println("------------------------");

        int age = 75;

        boolean valid = age >= 0 && age <= 150;

        String result = "";

        if (age >= 55) {
            result = "senior";
        } else if (age >= 21) {
            result = "adult";
        } else {
            result = "Teenager";
        }

        System.out.println(result);
    }

 }
