package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85; // 0~100

        boolean a = score >= 90 && score <= 100;
        // b = score >= 80 && score <= 89

        boolean b = score >= 80 && score <= 89;

        boolean c = score >= 70 && score <= 79;
        // boolean c = !a && !b && score >=70  this is another way to expression boolean

        boolean d = score >= 60 && score <= 69;

        boolean f = score >= 0 && score <= 59;


        if (a) {  // if the student made A

            System.out.println("Excellent");
        }

        if (b) { //if the student made B

            System.out.println("Great");
            if (c) {

                System.out.println("Good");
            }
            if (d) {

                System.out.println("Passed");
            }

            if (f) {

                System.out.println("failed");
            }
        }

          /* System.out.println( true == ! false);   // true
           System.out.println(!true !=false);// false
           System.out.println(!false == true); // true

          System.out.println(!!false); // false
          System.out.println(!!! true); */

    }
}
        /* 90~100 ==> Excellent
        80~ 89 ==> great
        70~ 79 ==> good
        60~ 59 ==> passed
        0~ 59 ==> failed

      */