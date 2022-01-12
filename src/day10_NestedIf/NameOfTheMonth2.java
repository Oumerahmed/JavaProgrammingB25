package day10_NestedIf;

public class NameOfTheMonth2 {
    public static void main(String[] args) {

        int number = 7;

        String result1 = " ";
        if (number >= 1 && number <= 12) {  // if it is valid  this is pre-condition
            if (number == 1) {
                result1 = "Jan";
            } else if (number == 2) {
                result1 = "Feb";
            } else if (number == 3) {
                result1 = "Mar";
            } else if (number == 4) {
                result1 = "Apr";
            } else if (number == 5) {
                result1 = "May";
            } else if (number == 6) {
                result1 = "Jun";
            } else if (number == 7) {
                result1 = "Jul";
            } else if (number == 8) {
                result1 = "Aug";
            } else if (number == 9) {
                result1 = "Sep";
            } else if (number == 10) {
                result1 = "Oct";
            } else if (number == 11) {
                result1 = "Nov";
            } else {
                result1 = "Dec";
            }
        } else {
            result1 = "invalid";
        }
        System.out.println(result1);

        System.out.println("-----------------------------");

        //  change to ternary

        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" :
                (number == 11) ? "Nov" : "Dec";

        System.out.println(name);
    }
}



