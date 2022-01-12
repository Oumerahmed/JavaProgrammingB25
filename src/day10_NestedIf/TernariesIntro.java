package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("even number"); // string
        } else {
            System.out.println("odd");  //  staring
        }
        System.out.println("---------------------------------------");


        String result11 = (n % 2 == 0) ? "Even number" : "Odd";

        System.out.println("result11");

        System.out.println("--------------------------");

        int age = 23;

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");  //String
        }
        System.out.println("--------------------------");
        // to change staring

        String result2 = (age >= 21) ? "Eligible" : "Not eligible";

        System.out.println(result2);

        System.out.println("-----------------");

        int nu = 1;

        if (nu > 0) {
            System.out.println(" positive");
        } else if (nu < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        System.out.println("---------------------");

        // by ternary

        String result13 = (nu > 0) ? "positive" : (nu < 0) ? "negative" : "zero";

        System.out.println(result13);

    }

}

