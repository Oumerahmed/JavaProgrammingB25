package day1;

import java.util.Arrays;

public class CustomInitials {

    public static void main(String[] args) {

        initialization("seattle", "washengton");

        System.out.println("------------------");

        String[] email = {"oumeradenmmmm@yahoo.com", "abrbrab@yahoo.com", "hasebenahusen@gmail.com"};
        for (String emails : email) {
            domain(emails);
        }

        System.out.println("-------------------");

        nameOfDay(5);


    }


    // 1. Create a method that can display the initials of the person.
    // initials(String firstName, String lastName)


    public static void initialization(String firstName, String lastName) {

        String initialization = firstName.charAt(0) + " . " + lastName.charAt(0);

        initialization = initialization.toUpperCase();

        System.out.println("initialization = " + initialization);
    }


    // 2. Create a method that can display the domain of the email. domain(String email)

    public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);
    }


    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number) {

        if (number < 1 || number > 7) {
            System.out.println("invalid number");
        }

        if (number == 1) {
            System.out.println("mon");
        } else if (number == 2) {
            System.out.println("tus");
        } else if (number == 3) {
            System.out.println("wed");
        } else if (number == 4) {
            System.out.println("thu");
        } else if (number == 5) {
            System.out.println("fri");
        } else if (number == 6) {
            System.out.println("sat");

        } else if (number == 7) {
            System.out.println("sun");
        }


        int[][] multiD = {{1, 2, 3,}, {4, 5, 6, 9}, {7}};
        System.out.println(Arrays.deepToString(multiD));




    }




    }



