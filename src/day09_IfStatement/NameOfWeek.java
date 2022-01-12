package day09_IfStatement;

public class NameOfWeek {
    public static void main(String[] args) {
        int n = 5;  // 1~7

        if (n == 1) {
            System.out.println("Momday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednsday");
        } else if (n == 4) {
            System.out.println("Thrusday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
        System.out.println("______________________________");

        String day;

        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tudday";

        } else if (n == 3) {
            day = "Wednday";

        } else if (n == 4) {
            day = " Thurday";

        } else if (n == 5) {
            day = " Friday";

        } else if (n == 6) {
            day = "Saturday";

        } else {
            day = " Sunday";
        }
        System.out.println("day = " + day);

        System.out.println("__________________________________");

    }
}
         /* print name of the week
          from Monday Sunday.
          */