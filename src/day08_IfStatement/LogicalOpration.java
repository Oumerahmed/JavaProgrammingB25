package day08_IfStatement;

public class LogicalOpration {

    public static void main(String[] args) {

        String name = " stiven";
        int age = 34;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == " usa";
        //   19>=18 && 'uk'== usa
        //  true  && false ===> false

        System.out.println(name + " is eligible to vote : " + isEligible);
        System.out.println("__________________________________");

        String name2 = "  Josh";
        int creaditScore = 500;
        int age2 = 17;
        int income = 40000;
        boolean isEligible2 = creaditScore >= 700 && age2 >= 21 && income >= 60000;


        System.out.println(name2 + "  is eligible for loan: " + isEligible2);

        System.out.println("----------------------------------");

        String name3 = " Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        // 21 >= 18 && ( 'F' == 'M'  || 'F'  'F')
        // true && (false || true)
        // true && true
        // true
        System.out.println(name3 + " is eligible to register : " + isEligible);

        System.out.println("-----------------------------");

        String name4 = " James";
        String contryOfBirth = "UK";
        boolean mariedToUSCitizen = false;

        boolean isEligible4 = contryOfBirth == "USA" || mariedToUSCitizen == true;

        //                true

        System.out.println(name4 + " is eligible to apply fo us citizenShip : " + isEligible4);

        System.out.println("---------------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible forscolarship: " + isEligible5);

        System.out.println("------------------------------");

        boolean result12 = true;
        System.out.println("result12 = " + result12);

        boolean result3 = !result12;
        System.out.println("result3 = " + result3);

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
