package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 119;
        if (score >= 0 && score <= 100) {  // this is pre- condition   if the score is valid

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {  // if the score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------");

        int age = 2;
        boolean hasId = true;

        if (hasId) { // if the person 21.
            System.out.println("Eligible");
            if (age >= 21) {
                System.out.println("Eligible to buy alcohole");
            } else {
                System.out.println("not Eligible to buy alcohole");
            }

        } else {
            System.out.println("You must have id to buy alchole");
        }

        System.out.println("----------------------------------");

        int number = 5;
        if (number >= 1 && number <= 7) { //   pre -condition if it is valid

            if (number == 1) {
                System.out.println("Mon");

            } else if (number == 2) {
                System.out.println("Tus");

            } else if (number == 3) {
                System.out.println("Wed");

            } else if (number == 4) {
                System.out.println("Thu");

            } else if (number == 5) {
                System.out.println("Fri");

            } else if (number == 6) {
                System.out.println("Sat");

            } else {
                System.out.println("Sun");
            }

        } else {
            System.out.println("Invalid score");
        }
    }

}














